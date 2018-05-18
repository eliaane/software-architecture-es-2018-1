package com.mycompany.mavenproject1.dao.algorithms.country;

import com.mycompany.mavenproject1.dao.DBConnectSingleton;
import com.mycompany.mavenproject1.dao.algorithms.UpdateDAO;
import com.mycompany.mavenproject1.data.Country;
import com.mycompany.mavenproject1.data.DAOEntity;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CountryUpdateDAO implements UpdateDAO {

    @Override
    public void update(DAOEntity newEntity, String value) {
        
        try {
            Country newCountry = (Country) newEntity;

            String sql = "UPDATE country SET name=?, acronym=?, digits=? WHERE name like ?";

            PreparedStatement statement = DBConnectSingleton.getInstance().prepareStatement(sql);
            statement.setString(1, newCountry.getName());
            statement.setString(2, newCountry.getAcronym());
            statement.setInt(3, newCountry.getDigits());
            statement.setString(4, value);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted == 0) {
                throw new RuntimeException("Country could not be updated!");
            }

        } catch (SQLException ex) {
            System.out.println(ex);

        }
    }
    
}
