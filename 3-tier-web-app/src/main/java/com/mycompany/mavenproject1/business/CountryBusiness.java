package com.mycompany.mavenproject1.business;

import com.mycompany.mavenproject1.dao.CountryDAO;
import com.mycompany.mavenproject1.dao.algorithms.country.CountryCreateDAO;
import com.mycompany.mavenproject1.dao.algorithms.country.CountryDeleteDAO;
import com.mycompany.mavenproject1.dao.algorithms.country.CountryReadDAO;
import com.mycompany.mavenproject1.dao.algorithms.country.CountryUpdateDAO;
import com.mycompany.mavenproject1.data.Country;
import com.mycompany.mavenproject1.data.DAOEntity;
import java.util.Set;

public class CountryBusiness {
    
    private CountryDAO dao;

    public CountryBusiness() {
        dao = new CountryDAO(
                new CountryCreateDAO(),
                new CountryReadDAO(),
                new CountryUpdateDAO(),
                new CountryDeleteDAO()
        );
        
    }
    
    public void create(Country country) throws Exception {
        dao.create(country);

    }

    public Set<? extends DAOEntity> readAll() {
        return dao.readAll();

    }

}
