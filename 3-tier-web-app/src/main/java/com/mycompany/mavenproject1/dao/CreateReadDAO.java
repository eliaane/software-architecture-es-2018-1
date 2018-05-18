package com.mycompany.mavenproject1.dao;

import com.mycompany.mavenproject1.dao.algorithms.CreateDAO;
import com.mycompany.mavenproject1.dao.algorithms.ReadDAO;
import com.mycompany.mavenproject1.data.DAOEntity;
import java.util.Set;

public class CreateReadDAO {
    
    protected CreateDAO create;
    protected ReadDAO read;
    
    public void create (DAOEntity e) throws Exception {
        create.create(e);
    }
    
    public Set<? extends DAOEntity> readAll() {
        return read.readAll();
    }
    
}
