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
package com.sap.xsk.hdb.ds.test.itest.utils;

public class TestContainerConstants {

  private TestContainerConstants() {
  }

  public static final String POSTGRESQL_DOCKER_IMAGE = "postgres:alpine";
  public static final String POSTGRESQL_DOCKER_NETWORK_ALIAS = "postgres";
  public static final String POSTGRESQL_EXPECTED_SEQUENCE_NAME = "sequence-itest::SampleSequence_HanaXSClassic";
  public static final int POSTGRESQL_EXPECTED_SEQUENCE_COUNT = 1;
  public static final String POSTGRESQL_ROOT_FOLDER = "/usr/local/target/dirigible/repository/root";
  public static final String POSTGRESQL_REPO_PATH = "/registry/public/sequence-itest/SampleSequence_HanaXSClassic.hdbsequence";
  public static final String POSTGRESQL_RELATIVE_RESOURCES_PATH = "/registry.public.sequence-itest/SampleSequence_HanaXSClassic.hdbsequence";
}