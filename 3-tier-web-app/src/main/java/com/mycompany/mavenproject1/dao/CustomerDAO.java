package com.mycompany.mavenproject1.dao;

import com.mycompany.mavenproject1.dao.algorithms.CreateDAO;
import com.mycompany.mavenproject1.dao.algorithms.ReadDAO;

public class CustomerDAO extends CreateReadDAO {

    public CustomerDAO (CreateDAO create, ReadDAO read) {
        this.create = create;
        this.read = read;
    }


}
