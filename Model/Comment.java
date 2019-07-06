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
public class Comment {

    private Integer taskId;

    private String comment;

    private String commentedBy;

    public Comment(Integer taskId, String comment, String commentedBy) {
        this.taskId = taskId;
        this.comment = comment;
        this.commentedBy = commentedBy;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public String getCommentedBy() {
        return commentedBy;
    }

    public void setCommentedBy(String commentedBy) {
        this.commentedBy = commentedBy;
    }

//    public static int Task_Id;
//
//    public static String task_completion;
//
//    Scanner sc = new Scanner(System.in);
//
//    void Commment_on_data() throws Exception {
//        //1. DB Connection
//        System.out.println("****List of all Task****");
//
//        //2. Logic to get data from user
//        System.out.println("Please enter the Task_Id to comment about the status of the project");
//        System.out.println("Enter Task_Id : ");
//
//        Task_Id = sc.nextInt();
//        task_completion = sc.next();
//        //
//        String query1 = "{call Project_delivery.COMMENT('" + Task_Id + "','" + task_completion + "')}";
//        con.prepareCall(query1);
//        CallableStatement csmt1 = con.prepareCall(query1);
//        csmt1.executeQuery();
//        System.out.println("Result updated");
//        //Manager mg = new Manager();
//        Manager.main();
//
//    }
}
