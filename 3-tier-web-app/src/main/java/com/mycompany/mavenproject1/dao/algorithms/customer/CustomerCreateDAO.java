package com.mycompany.mavenproject1.dao.algorithms.customer;

import com.mycompany.mavenproject1.dao.DBConnectSingleton;
import com.mycompany.mavenproject1.dao.algorithms.CreateDAO;
import com.mycompany.mavenproject1.data.Customer;
import com.mycompany.mavenproject1.data.DAOEntity;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerCreateDAO implements CreateDAO {

    @Override
    public void create(DAOEntity e) throws Exception {
        try {
            
            Customer customer = (Customer) e;

            String sql = "INSERT INTO customer (name, phone, age, country_id, creditLimit) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement statement = DBConnectSingleton.getInstance().prepareStatement(sql);
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getPhone());
            statement.setInt(3, customer.getAge());
            statement.setInt(4, customer.getCountry().getId());
            statement.setDouble(5, customer.getCreditLimit());

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted == 0) {
                throw new RuntimeException("Customer could not be persisted!");
            }

        } catch (SQLException ex) {
            throw new Exception(ex);

        }
    }
    
}
