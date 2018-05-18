package com.mycompany.mavenproject1.dao.algorithms.country;

import com.mycompany.mavenproject1.dao.DBConnectSingleton;
import com.mycompany.mavenproject1.dao.algorithms.ReadDAO;
import com.mycompany.mavenproject1.data.Country;
import com.mycompany.mavenproject1.data.DAOEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class CountryReadDAO implements ReadDAO {

    @Override
    public Set<? extends DAOEntity> readAll() {
        
        Set<Country> resultSet = new HashSet<>();

        try {

            String sql = "SELECT * FROM country";

            Statement statement = DBConnectSingleton.getInstance().createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                resultSet.add(new Country(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getString("acronym"),
                        result.getInt("digits")
                ));
            }

        } catch (SQLException ex) {
            System.out.println(ex);

        }

        return resultSet;
    }

}
