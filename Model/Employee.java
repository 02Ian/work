/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.service.TaskServiceImpl;
import java.util.Scanner;

/**
 *
 * @author em-pc031
 */
public class Employee {

    private int id;

    private String username;

    private String password;

    private String operation;

    public static String Taskcom = "Incomplete";

    public static int Task_Id;

    public static String task_completion;

    static Scanner sc = new Scanner(System.in);

    private String userName;

    public Employee(Integer id, String username, String operation, String password, Integer Task_id) {
        this.id = id;
        this.username = username;
        this.operation = operation;
        this.password = password;
        this.Task_Id = Task_id;

    }

    public static int getTask_Id() {
        return Task_Id;
    }
    public void setTask_Id(int Task_Id) {
        this.Task_Id = Task_Id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getoperation() {
        return operation;
    }

    public void setoperation(String operation) {
        this.operation = operation;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public void viewincomplete_TASK() throws Exception {
        System.out.println("List of all the incomplete Task");

        TaskServiceImpl t = new TaskServiceImpl(userName);
        t.detail();
    }
}

//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp_31_DARE", "root", "admin");
//        String query =Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp_31_DARE", "root", "admin");"{call Project_delivery.Completion('"+ Taskcom +"')}";
//        CallableStatement csmt1= con.prepareCall(query);
//        ResultSet rs= csmt1.executeQuery();
//        System.out.println(("EMP_Id\t")+""+("Project_Id\t")+""+("Task_Type\t")+""+("Task_Id\t")+""+("operation\t"));
//             while(rs.next()){
//                 System.out.println(""+rs.getInt("emp_id")+ "\t"+   rs.getString("Project_Id")+"    \t"+rs.getString("Task_Type")+ "   \t"+rs.getString("Task_id")+ "    \t"+rs.getString("Task_completion"));  
//             }
