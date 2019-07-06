/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Scanner;
/**
 *
 * @author em-pc031
 */
public class Manager{
    
    static Scanner sc = new Scanner(System.in);
    public static int data;
    public static String name; 
    public static String Taskcom;
    public static String pass;    
    public static String operator;
    public static int emp_id;
    public static String Project_Id;
    public static String Task_Type;
    public static String Task_id;
    public static String Task_completion;
 //   private static Project project;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        Manager.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Manager.name = name;
    }

    public String getTaskcom() {
        return Taskcom;
    }

    public void setTaskcom(String Taskcom) {
        Manager.Taskcom = Taskcom;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        Manager.pass = pass;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        Manager.operator = operator;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        Manager.emp_id = emp_id;
    }

    public String getProject_Id() {
        return Project_Id;
    }

    public void setProject_Id(String Project_Id) {
        Manager.Project_Id = Project_Id;
    }

    public  String getTask_Type() {
        return Task_Type;
    }

    public void setTask_Type(String Task_Type) {
        Manager.Task_Type = Task_Type;
    }

    public String getTask_id() {
        return Task_id;
    }

    public void setTask_id(String Task_id) {
        Manager.Task_id = Task_id;
    }

    public String getTask_completion() {
        return Task_completion;
    }

    public void setTask_completion(String Task_completion) {
        Manager.Task_completion = Task_completion;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public void validate() {
//        System.out.print("Enter Username");
//        name = sc.next();
//        System.out.print("Enter password");
//        pass = sc.next();

//    }
//    public void Preferance() {
//       System.out.println("Enter **Incomplete** or **Completed** to see the respective Task Status ");
//        Taskcom = sc.next();
//        }

//    public static void Maintain_Schedule(Employee employee) throws Exception{
//         Connection con1= DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_delivery", "root", "admin");
//         String query ="{call Project_delivery.Completion('"+ Taskcom +"')}";
//         CallableStatement csmt1= con1.prepareCall(query);
//         ResultSet rs1= csmt1.executeQuery();
//         System.out.println(("Id")+"   "+("Project_Id")+"   "+("Task_Type")+"       "+("Task_Id")+"   "+("operation"));
//             while(rs1.next()){
//                 System.out.println(rs1.getInt("emp_id")+ "      "+rs1.getString("Project_Id")+ "         "+rs1.getString("Task_Type")+ "       "+rs1.getString("Task_id")+ "     "+rs1.getString("Task_completion"));
//           }
//    }
    
//    public void add_task()throws Exception{
//        System.out.println("2 - 6 = Employee");
//        System.out.println("Enter Employee_Id : ");emp_id=sc.nextInt();
//        System.out.println("A,B,C,D");
//        System.out.println("Enter Project_Id : ");Project_Id=sc.next();
//        System.out.println("1.Manufacturing\n 2.Automation\n 3.Semi-Automatic\n 4.Telecommunication");
//        System.out.println("Enter Task_Type : ");Task_Type=sc.next();
//        System.out.println("1.Completed\n 2.Incomplete");
//        int i=sc.nextInt();
//         if(i == 1)
//        {
//            Task_completion="Completed";
//        }
//        if(i==2){
//                Task_completion="Incomplete";
//                }
//    }
//        Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_delivery", "root", "admin");
//        String query1 ="{call Project_delivery.add_in_list('"+ emp_id +"','"+ Project_Id +"','"+ Task_Type +"','"+ Task_completion +"')}";
//        CallableStatement csmt2= con2.prepareCall(query1);
//        csmt2.executeQuery();
//        System.out.println("Data has been entered");
//        validate();
//        }
//    
//    public static void main(String[] args) throws Exception {
//        // TODO code application logic here
//        Manager mg = new Manager();
//       
//        try {
//            mg.validate();
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_delivery", "root", "admin");
//            String query = "{ call Password_Verification('" + name + "','" + pass + "')}";
//            CallableStatement csmt = con.prepareCall(query);
//            
//            ResultSet rs = csmt.executeQuery();
//            if (rs.next()) {
//                System.out.println("Access Granted welcome :" + rs.getString("username") +"\nYou are an ****"+rs.getString("operation")+"****");
//                
//                Employee employee = new Employee();
//
//                employee.setId(rs.getInt("Id"));
//                employee.setusername(rs.getString("username"));
//                employee.setpassword(rs.getString("password"));
//                employee.setoperation(rs.getString("operation"));
//                operator = employee.getoperation();
//                if(!" Manager".equals(operator)){System.out.println("YOUR not a "+operator);}else{
//                    mg.Preferance();    
//                    Maintain_Schedule(employee);
//                   System.out.println("Would you like to delete a data");
//                     int i=sc.nextInt(); 
//                   if(i==1)
//                 {
//                 ProjectDAOImpl pr= new ProjectDAOImpl();    
//                 pr.collect_feedback(project);
//                 }
//                }
//                if(operator.equals("Operator")){
//                    Thread.sleep(500);
//                    System.out.println("Gathering the Incomplete Project Data....");
//                    Thread.sleep(2000);
//                    employee.viewincomplete_TASK();
//                }
//             }else{
//                
//                System.exit(0);
//                 
//             }
//            
//             System.out.println("Enter 1 to add new task and 0 to exit");
//                 data = sc.nextInt();
//                 if(data == 1){
//                     mg.add_task();                      
//                 }else{
//                     System.out.println("YOU will exit in ");
//                     Thread.sleep(100);
//                     System.out.println("3");
//                     Thread.sleep(1000);
//                     System.out.println("2");
//                     Thread.sleep(1000);
//                     System.out.println("1");
//                     Thread.sleep(1000);
//                     System.out.println("0");
//                     System.out.println("EXIT");
//                 }
//            }catch (ClassNotFoundException | SQLException e) {
//             //System.out.println("Incorrect Password");
//        }
//      
//        
//    }
//}