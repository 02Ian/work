/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import static com.model.Manager.Task_id;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author em-pc031
 */
public class TaskDAOImpl implements TaskDAO {

    private final ConnectionFactory connectionFactory;
    
    public TaskDAOImpl(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }
   
    @Override
    public void gather_User_Date() {
        try {
            Connection connection = connectionFactory.getConnection();
            String dataretrival = "Select * from Task where Task_id = '"+Task_id+"'";
            PreparedStatement prep = connection.prepareCall(dataretrival);
            prep.executeQuery();
            ResultSet rs = prep.executeQuery();
            while (rs.next())
            {
               // return rs.getInt("emp_id"+ "      " + rs.getString"Project_Id" + "         " + rs.getString"Task_Type" + "       " + rs.getString"Task_id" + "     " + rs.getString"Task_completion" ;
                System.out.println(rs.getInt("emp_id") + "      " + rs.getString("Project_Id") + "         " + rs.getString("Task_Type") + "       " + rs.getString("Task_id") + "     " + rs.getString("Task_completion"));
            }
            
            System.out.println("YEEEEEEEE");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TaskDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
