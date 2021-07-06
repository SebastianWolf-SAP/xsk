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
package com.sap.xsk.migration.module;

import com.sap.xsk.migration.neo.db.hana.HanaModule;
import com.sap.xsk.migration.neo.sdk.NeoSdkModule;
import com.sap.xsk.migration.tooling.ToolingModule;
import org.eclipse.dirigible.commons.api.module.AbstractDirigibleModule;

public class XSKMigrationModule extends AbstractDirigibleModule {

  @Override
  protected void configure() {
//    bind(IRestService.class).to(XSKMigrationRestService.class); // TODO: see why binding here does not work and needs a 'services' file
    install(new ToolingModule());
    install(new NeoSdkModule());
    install(new HanaModule());
  }

  @Override
  public String getName() {
    return "XSK Migration Module";
  }
}