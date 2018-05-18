package com.mycompany.mavenproject1.dao.algorithms;

import java.util.Set;
import com.mycompany.mavenproject1.data.DAOEntity;

public interface ReadDAO {
    
    public Set<? extends DAOEntity> readAll();
    
}
