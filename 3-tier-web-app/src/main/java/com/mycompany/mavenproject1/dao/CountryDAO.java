package com.mycompany.mavenproject1.dao;

import com.mycompany.mavenproject1.dao.algorithms.CreateDAO;
import com.mycompany.mavenproject1.dao.algorithms.DeleteDAO;
import com.mycompany.mavenproject1.dao.algorithms.ReadDAO;
import com.mycompany.mavenproject1.dao.algorithms.UpdateDAO;
import java.util.Set;

import com.mycompany.mavenproject1.data.Country;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class CountryDAO extends FullDAO {
    
    public CountryDAO(
            CreateDAO create, 
            ReadDAO read, 
            UpdateDAO update, 
            DeleteDAO delete) {
        
        this.create = create;
        this.read = read;
        this.update = update;
        this.delete = delete;
    }



}
