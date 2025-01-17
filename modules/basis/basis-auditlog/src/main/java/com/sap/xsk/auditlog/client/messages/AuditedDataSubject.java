/*
 * Copyright (c) 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.auditlog.client.messages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;
import java.util.Map;

public class AuditedDataSubject {

  @Expose
  @SerializedName("type")
  private final String type;

  @Expose
  @SerializedName("role")
  private final String role;

  @Expose
  @SerializedName("id")
  private final Map<String, String> id;

  public AuditedDataSubject(String type, String role, Map<String, String> identifiers) {
    this.type = type;
    this.role = role;
    this.id = new LinkedHashMap<>(identifiers);
  }

  public AuditedDataSubject(String type, Map<String, String> identifiers) {
    this.type = type;
    this.id = new LinkedHashMap<>(identifiers);
    this.role = null;
  }

  public String getType() {
    return this.type;
  }

  public String getRole() {
    return this.role;
  }

  public LinkedHashMap<String, String> getId() {
    return new LinkedHashMap<>(id);
  }
}

