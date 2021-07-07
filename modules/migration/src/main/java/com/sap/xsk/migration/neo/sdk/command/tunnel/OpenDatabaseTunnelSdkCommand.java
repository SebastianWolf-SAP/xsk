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
package com.sap.xsk.migration.neo.sdk.command.tunnel;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sap.xsk.migration.neo.sdk.command.AbstractSdkCommand;
import com.sap.xsk.migration.neo.sdk.command.SdkCommandParsedOutput;
import com.sap.xsk.migration.tooling.MigrationToolExecutor;

import javax.inject.Inject;
import java.util.List;

public class OpenDatabaseTunnelSdkCommand extends AbstractSdkCommand<OpenDatabaseTunnelSdkCommandArgs, OpenDatabaseTunnelSdkCommandRes> {

  private static final String OPEN_DATABASE_TUNNEL_COMMAND_NAME = "open-db-tunnel";

  @Inject
  public OpenDatabaseTunnelSdkCommand(MigrationToolExecutor migrationToolExecutor) {
    super(migrationToolExecutor);
  }

  @Override
  public OpenDatabaseTunnelSdkCommandRes execute(OpenDatabaseTunnelSdkCommandArgs commandArgs) {
    List<String> commandAndArguments = createProcessCommandAndArguments(commandArgs, OPEN_DATABASE_TUNNEL_COMMAND_NAME);
    String rawCommandOutput = migrationToolExecutor.executeMigrationTool(NEO_SDK_DIRECTORY, commandAndArguments);
    SdkCommandParsedOutput<OpenDatabaseTunnelSdkCommandRes> parsedCommandOutput = new Gson().fromJson(rawCommandOutput, new TypeToken<SdkCommandParsedOutput<OpenDatabaseTunnelSdkCommandRes>>() {
    }.getType());
    return parsedCommandOutput.getResult();
  }
}
