/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.dao.CommentDAO;
//import com.service.CommentServiceImpl;
import java.util.Scanner;
/**
 *
 * @author em-pc031
 */
public class Task {

    Scanner sc = new Scanner(System.in);
    private CommentDAO commentDAO;
    private String userName;


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
    
    Task(String userName){
        this.userName = userName;
    }

 }
    

   // public void List() {
        //System.out.println("\n*****List of all the Task*****\n");
//        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_delivery", "root", "admin");
//
//        String dataretrival = "Select * from Task where Task_id = Task_Id";
//        PreparedStatement prep = con1.prepareCall(dataretrival);
//        ResultSet rs = prep.executeQuery();
//        while (rs.next()) {
//            System.out.println("" + rs.getInt("emp_id") + "\t" + rs.getString("Project_Id") + "    \t" + rs.getString("Task_Type") + "   \t" + rs.getString("Task_id") + "    \t" + rs.getString("Task_completion"));
//        }
//        CommentServiceImpl cs = new CommentServiceImpl(commentDAO);
//        cs.addComment(userName);
//        System.out.println("Press 1 for deleting a project");
//    }
//}
