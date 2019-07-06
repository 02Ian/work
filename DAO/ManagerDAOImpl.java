/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Employee;
import static com.model.Manager.Taskcom;
import com.service.ManagerServiceImpl;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author em-pc031
 */
public class ManagerDAOImpl implements ManagerDAO {

    @Override
    public void Maintain_Schedule(Employee employee) {
        try {
            ConnectionFactory connection = new ConnectionFactory("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306", "Project_delivery", "root", "admin");

            connection.getConnection();
            String query = "{call Project_delivery.Completion('" + Taskcom + "')}";
            CallableStatement csmt1 = connection.prepareCall(query);
            ResultSet rs1 = csmt1.executeQuery();
            System.out.println(("Id") + "   " + ("Project_Id") + "   " + ("Task_Type") + "       " + ("Task_Id") + "   " + ("operation"));
            while (rs1.next()) {
                System.out.println(rs1.getInt("emp_id") + "      " + rs1.getString("Project_Id") + "         " + rs1.getString("Task_Type") + "       " + rs1.getString("Task_id") + "     " + rs1.getString("Task_completion"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ManagerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void add_task(int emp_id, String Project_Id, String Task_Type, String Task_completion) {
        try {
            ConnectionFactory connection = new ConnectionFactory("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306", "Project_delivery", "root", "admin");
            connection.getConnection();
            String query1 = "{call Project_delivery.add_in_list('" + emp_id + "','" + Project_Id + "','" + Task_Type + "','" + Task_completion + "')}";
            CallableStatement csmt2 = connection.prepareCall(query1);
            csmt2.executeQuery();
            System.out.println("Data has been entered");
            ManagerServiceImpl mg = new ManagerServiceImpl(this);
            mg.validate();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ManagerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
