/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Comment;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author em-pc031
 */
public class CommentDAOImpl implements CommentDAO{
    
    private final ConnectionFactory connectionFactory;

    public CommentDAOImpl(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }
    
    @Override
    public void save(Comment comment) {
        try {
            Connection connection = connectionFactory.getConnection();
            String query1 = "{call Project_delivery.COMMENT('" + comment.getTaskId() + "','" + comment.getComment()+ "','" + comment.getCommentedBy() + "')}";
            connection.prepareCall(query1);
            CallableStatement csmt1 = connection.prepareCall(query1);
            csmt1.executeQuery();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CommentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
