package com.example.superhero_v4.repositories;

import com.example.superhero_v4.model.Superhelt;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheltRepository  {
    public void superheoes() throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:/localhost:3306/heroes", "C856k","Leno$a01")){
            String SQL = "SELECT heroes from Heroes";
            String SQL1 = "COUNT heroes from Heroes";
            try (Statement stmt = connection.createStatement()) {
                ResultSet rs = stmt.executeQuery(SQL);
                ResultSet rs1 = stmt.executeQuery(SQL1);
                PreparedStatement ps = connection.prepareStatement(SQL);
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public List<Superhelt> getSuperheroes() {
        return getSuperheroes();
    }

    public Superhelt addSuperheroes(Superhelt superhelt) {
        return addSuperheroes(superhelt);
    }
}
