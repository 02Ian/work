/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Employee;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author em-pc031
 */
public class EmployeeDAOImpl implements EmployeeDAO{

    private final ConnectionFactory connectionFactory;

    public EmployeeDAOImpl(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }
    @Override
    public String viewincomplete_TASK(Employee emp){
        String FinalString = null;
        try {
            Connection connection = connectionFactory.getConnection();
            String query = "{call Project_delivery.Completion('" + emp.getTask_Id() + "')}";
            CallableStatement csmt1 = connection.prepareCall(query);
            ResultSet rs = csmt1.executeQuery();
            System.out.println();
            FinalString = ("EMP_Id\t") + "" + ("Project_Id\t") + "" + ("Task_Type\t") + "" + ("Task_Id\t") + "" + ("operation\t") + "\n";
            while (rs.next()) {
                FinalString += "" + rs.getInt("emp_id") + "\t" + rs.getString("Project_Id") + "    \t" + rs.getString("Task_Type") + "   \t" + rs.getString("Task_id") + "    \t" + rs.getString("Task_completion") + "\n";
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EmployeeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            
        }return FinalString;
    }
    
    
    

}
