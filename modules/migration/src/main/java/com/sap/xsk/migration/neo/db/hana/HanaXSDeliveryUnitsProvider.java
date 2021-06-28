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
package com.sap.xsk.migration.neo.db.hana;

import com.sap.xsk.migration.neo.db.DeliveryUnit;
import com.sap.xsk.migration.neo.db.DeliveryUnitsProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class HanaXSDeliveryUnitsProvider implements DeliveryUnitsProvider {

  private static final String HANA_JDBC_URL = "jdbc:sap://localhost:30015";
  private static final String HANA_DELIVERY_UNITS_QUERY = "SELECT DELIVERY_UNIT, VENDOR FROM \"_SYS_REPO\".\"DELIVERY_UNITS\"";
  private static final String NO_DB_CONNECTION_EXCEPTION_MESSAGE = "Couldn't connect to database!";
  private static final String COULD_NOT_QUERY_DELIVERY_UNITS_EXCEPTION_MESSAGE = "Couldn't connect to database!";

  @Override
  public List<DeliveryUnit> getDeliveryUnitsNames(String user, String password) {
    Connection connection = createHanaConnection(user, password);

    try {
      var statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery(HANA_DELIVERY_UNITS_QUERY);
      return readDeliveryUnitsResultSet(resultSet);
    } catch (SQLException e) {
      throw new DeliveryUnitsException(COULD_NOT_QUERY_DELIVERY_UNITS_EXCEPTION_MESSAGE, e);
    }
  }

  private static Connection createHanaConnection(String user, String password) {
    Connection connection;

    try {
      connection = DriverManager.getConnection(HANA_JDBC_URL, user, password);
    } catch (SQLException e) {
      throw new DeliveryUnitsException(NO_DB_CONNECTION_EXCEPTION_MESSAGE, e);
    }

    if (connection == null) {
      throw new DeliveryUnitsException(NO_DB_CONNECTION_EXCEPTION_MESSAGE);
    }

    return connection;
  }

  private static List<DeliveryUnit> readDeliveryUnitsResultSet(ResultSet deliveryUnitsResultSet) throws SQLException {
    var deliveryUnits = new ArrayList<DeliveryUnit>();
    while (deliveryUnitsResultSet.next()) {
      String deliveryUnitName = deliveryUnitsResultSet.getString(1);
      String deliveryUnitVendor = deliveryUnitsResultSet.getString(2);

      var deliveryUnit = new DeliveryUnit(deliveryUnitName, deliveryUnitVendor);
      deliveryUnits.add(deliveryUnit);
    }
    return deliveryUnits;
  }
}