package com.mycompany.mavenproject1.dao.algorithms.customer;

import com.mycompany.mavenproject1.dao.DBConnectSingleton;
import com.mycompany.mavenproject1.dao.algorithms.ReadDAO;
import com.mycompany.mavenproject1.data.Customer;
import com.mycompany.mavenproject1.data.DAOEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class CustomerReadDAO implements ReadDAO {

    @Override
    public Set<? extends DAOEntity> readAll() {
        Set<Customer> resultSet = new HashSet<>();

        try {

            String sql = "SELECT * FROM customer";

            Statement statement = DBConnectSingleton.getInstance().createStatement();
            ResultSet result = statement.executeQuery(sql);

            Customer customer = null;

            while (result.next()) {
                customer = new Customer();
                customer.setId(result.getInt("id"));
                customer.setAge(result.getInt("age"));
                customer.setName(result.getString("name"));
                // customer.setCountry(new CountryDAO().readById(result.getInt("country_id")));
                customer.setPhone(result.getString("phone"));
                customer.setCreditLimit(result.getDouble("creditLimit"));
                
                resultSet.add(customer);

            }

        } catch (SQLException ex) {
            System.out.println(ex);

        } catch (Exception ex) {
            // Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;
    }
    
}
