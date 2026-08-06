package com.ajay.util;
import java.sql.*;

public class DBConnection {

    private static final String Url ="jdbc:postgresql://localhost:5432/Students";

    private static final String Username="postgres";

    private static final String Password="Ajay@2025";

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(Url,Username,Password);

        } catch (SQLException e) {
            throw new RuntimeException(
        " Database Connection failed",e);
        }
    }


}
