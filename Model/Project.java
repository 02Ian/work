/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author em-pc031
 */
public class Project {

    public static String pro_ID;
   

    public Project(String pro_ID) {
        this.pro_ID = pro_ID ;
    }

    public static String getPro_ID() {
        return pro_ID;
    }

    public void setPro_ID(String pro_ID) {
        this.pro_ID = pro_ID;
    }

//  void collect_feedback() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Emp_31_DARE", "root", "admin");
//
//        System.out.println("Enter Task_Id : ");
//
//        pro_ID = sc.next();
//        String query1 = "{call Project_delivery.Delete('" + pro_ID + "')}";
//        //con.prepareCall(query1);
//        CallableStatement csmt1 = con.prepareCall(query1);
//        csmt1.executeQuery();
//       System.out.println("Executed");
//    }
}
