package com.mycompany.mavenproject1.dao.algorithms.country;

import com.mycompany.mavenproject1.dao.DBConnectSingleton;
import com.mycompany.mavenproject1.dao.algorithms.CreateDAO;
import com.mycompany.mavenproject1.data.Country;
import com.mycompany.mavenproject1.data.DAOEntity;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CountryCreateDAO implements CreateDAO {

    @Override
    public void create(DAOEntity e) throws Exception {
        try {
            Country country = (Country) e;

            String sql = "INSERT INTO country (name, acronym, digits) VALUES (?, ?, ?)";

            PreparedStatement statement = DBConnectSingleton.getInstance().prepareStatement(sql);
            statement.setString(1, country.getName());
            statement.setString(2, country.getAcronym());
            statement.setInt(3, country.getDigits());

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted == 0) {
                throw new RuntimeException("Country could not be persisted!");
            }

        } catch (SQLException ex) {
            throw new Exception(ex);

        }
    }
    
}
