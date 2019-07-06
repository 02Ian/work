/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Project;
import static com.model.Project.pro_ID;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author em-pc031
 */
public class ProjectDAOImpl implements ProjectDAO {

    @Override
    public void collect_feedback(Project project) {
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306", "Project_delivery", "root", "admin");

            connectionFactory.getConnection();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProjectDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query1 = "{call Project_delivery.Delete('" + pro_ID + "')}";
        CallableStatement csmt1 = ConnectionFactory.prepareCall(query1);
        try {
            csmt1.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProjectDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
