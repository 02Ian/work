/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Comment;

/**
 *
 * @author em-pc031
 */
public interface CommentDAO {
    
    void save(Comment comment);
}
