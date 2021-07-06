package com.sap.xsk.migration.neo.db.hana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class HanaConnectionProvider {

  public Connection getConnection(String url, String user, String password) throws SQLException {
    return DriverManager.getConnection(url, user, password);
  }
}