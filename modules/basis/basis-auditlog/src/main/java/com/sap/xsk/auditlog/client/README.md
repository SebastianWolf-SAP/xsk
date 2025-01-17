# Audit Log consumption

## Audit Log Service

The `Audit Log Service`  provides means applications and runtimes to comply with certain regulations by audit logging events of great
importance. It guarantees that if the logs are written (response with 201), then they won't be lost and that their retention period is 90
days.

There are 4 types of logs:

* data access logs (when accessing sensitive information)
* personal data alteration
* security event logs
* configuration change logs

Every single type of log is derived directly from specific requirements of the standard.

## Audit Log API

The `Audit Log` service provides 2 APIs - for log retrieval and for writing logs, which cannot be accessed directly. The only way to use
them is through particular services, which expose those APIs - `Audit Log Service` for the `write` API and `Audit Log Management` for
the `read`
API. To create any type of service one should:

* Log into your subaccount in `SAP BTP Platform` and open `Service Marketplace` from the menu.
* Search for the needed service and create an instance of it.

Although the above-mentioned steps are enough for the creation of an instance of most of the offered services, this is not the case for
the `Audit Log Service` service, because the `Write API` is reserved only for SAP services/applications. Therefore, special permission is
needed to access it - a special entitlement, which is applied per global account.

So let's assume that you have all the needed permissions to create the instances of those services. When creating those instances a choice
will be given to you, what type of service should be created - `standard` (deprecated) or `oauth2` (
currently recommended). The latter uses `OAuth2` for Authentication/Authorization and additionally modifies/populates some properties of the
log, like `tenant` and `user`.

Let's assume from now on that `oauth2` type is chosen for the oauth service.

Given that we have to use OAuth token every time we use the service of type `oauth2`, how do we get this token? The answer is
straightforward - we have to call the `OAuth` server by providing special credentials to retrieve the token.

How do we get those special credentials?

* Go to your subaccount and select `Instances and Subscriptions`
* Click on the service instance, and a new window will appear on your far right
* Click `Create` in the `Service Keys` section to create an instance of `service keys`.
* To retrieve the needed configs just click on your `service keys` instance and select the action `View`

The `service keys` configuration should look like this:

```JSON
{
    "url": "<service_url>",
    "uaa": {
        "clientid": "<randomly_generated_string>",
        "clientsecret": "<randomly_generated_string>",
        "url": "<oauth_token_issuer_url>",
        "identityzone": "<name_of_identity_zone>",
        "identityzoneid": "<some_identifier>",
        "tenantid": "<some_identifier>",
        "tenantmode": "dedicated",
        "sburl": "<internal_xsuaa_url>",
        "apiurl": "<authentication_api>",
        "verificationkey": "<certificate>",
        "xsappname": "<name_of_application_instance>",
        "subaccountid": "<id_of_subaccount>",
        "uaadomain": "<domain_of_uaa>",
        "zoneid": "<some_identifier>"
    },
    "vendor": "SAP"
}
```

We are interested only in the following properties:

* `url` (top level in the hierarchy) - the host url of the service, in this case it's the Audit Log
* `uaa.clientid` and `uaa.clientsecret` - used for the basic authentication then requesting new OAuth token
* `uaa.url` - the host url, used for generating OAuth tokens

### Audit Log Authentication/Authorization

To generate an `OAuth` token, the request should contain:

* the request url `https://<host_uaa_url>/oauth/token?grant_type=client_credentials`
* the pair `clientid` and `clientsecret` as `Basic` authentication parameters

The response is in `JSON` format, which includes the property `access_token`, whose value represents the token value, which we are going to include
in the requests to the `Audit Log` service.

### `Audit Log Service` service - Write API

The API for sending audit logs : `/audit-log/oauth2/v2/<log_type>`
where `<log_type>` can be:

* `data-accesses` - for data access logs
* `security-events` - for security event logs
* `data-modifications` - for data modification logs
* `configuration-changes` - for configuration change logs

The payload contains the log, you want to save in the `Audit Log`. Most of them have identical structures - the same properties, but a small
subset of them require additional properties. The `Audit Log Service` service guarantees that if the log is successfully saved, then status 
code `201` with the id of the `log` will be returned.

Two of the common log properties - `tenant` and `user`, are of a particular interest.

The value of the `tenant` should be set to one of these values:

* `$PROVIDER` (special word) - when the service wants to audit log on behalf of itself
* `$SUBSCRIBER` (special word) - when the service wants to audit log on behalf of one of its customers

Regarding the value of `user` - it should be always set to `$USER` (special word) - the user who is actually writing the auditlog . When the
log is sent to the audit log service, those template values will be dynamically modified according to what values for these properties were
used.

### Audit Log Management service - Read API

The API for the retrieval of the logs:`/auditlog/v2/auditlogrecords`. Retrieving logs for a specific period can be accomplished by adding
the query params `time_from` and `time_to`, whose value should be timestamps in UTC in the following format: `YYYY-MM-DDTHH:mm:ss` The
retrieved logs will be in JSON format, which includes the following properties:

* `message_uuid` - Unique identifier of the message
* `user` - The logged-in user that performs the auditable action
* `time` - The time when the auditable event has been executed.
* `tenant` - The tenant is the identifier of the owner of the audit log message.
* `message` - JSON string of the original log, which was sent to the Audit Log
* `category` - audit log type, for instance `audit.data-access`
* `org_id` - The organization GUID of the component that is using the audit log service to write audit logs.
* `space_id` - The space GUID of the component that is using the audit log service to write audit logs.
* `app_or_service_id` - The GUID of the application/service that is using the audit log service to write audit logs.

Although the `Audit Log Service` service guarantees that the log won't be lost, there is no guarantee that the log will be visible
immediately through the `Audit Log Management` service. This delay could last hours, even days.

## Resources

* [Audit Logging in the Cloud Foundry Environment](https://help.sap.com/viewer/65de2977205c403bbc107264b8eccf4b/Cloud/en-US/f92c86ab11f6474ea5579d839051c334.html)
