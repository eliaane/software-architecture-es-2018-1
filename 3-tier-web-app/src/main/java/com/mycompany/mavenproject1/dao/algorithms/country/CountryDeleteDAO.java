package com.mycompany.mavenproject1.dao.algorithms.country;

import com.mycompany.mavenproject1.dao.DBConnectSingleton;
import com.mycompany.mavenproject1.dao.algorithms.DeleteDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CountryDeleteDAO implements DeleteDAO {

    @Override
    public void delete(String value) {
        try {

            String sql = "DELETE FROM country WHERE name like ?";

            PreparedStatement statement = DBConnectSingleton.getInstance().prepareStatement(sql);
            statement.setString(1, value);

            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted == 0) {
                throw new RuntimeException("Country could not be deleted!");
            }

        } catch (SQLException ex) {
            System.out.println(ex);

        }
    }
    
    
}
