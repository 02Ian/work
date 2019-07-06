/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Employee;

/**
 *
 * @author em-pc031
 */
public interface ManagerDAO {
    void Maintain_Schedule(Employee employee);
    void add_task(int emp_id,String Project_Id,String Task_Type,String Task_completion);
   
}
