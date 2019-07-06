/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author em-pc031
 */
public class ConnectionFactory {

    static CallableStatement prepareCall(String query1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void executeQuery() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private final String driver;

    private final String url;

    private final String schema;

    private final String user;

    private final String password;

    public ConnectionFactory(String driver, String url, String schema, String user, String password) {
        this.driver = driver;
        this.url = url;
        this.schema = schema;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url + schema, user, password);
        return con;
    }

}
