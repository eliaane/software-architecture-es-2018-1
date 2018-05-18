package com.mycompany.mavenproject1.dao;

import com.mycompany.mavenproject1.dao.algorithms.CreateDAO;
import com.mycompany.mavenproject1.dao.algorithms.DeleteDAO;
import com.mycompany.mavenproject1.dao.algorithms.ReadDAO;
import com.mycompany.mavenproject1.dao.algorithms.UpdateDAO;
import com.mycompany.mavenproject1.data.DAOEntity;
import java.util.Set;

public abstract class FullDAO {
    
    protected CreateDAO create;
    protected ReadDAO read;
    protected UpdateDAO update;
    protected DeleteDAO delete;

    public void create (DAOEntity e) throws Exception {
        create.create(e);
    }
    
    public Set<? extends DAOEntity> readAll() {
        return read.readAll();
    }
    
    public void update(DAOEntity newEntity, String value) {
        update.update(newEntity, value);
    }
    
    public void delete(String value) {
        delete.delete(value);
    }

}
