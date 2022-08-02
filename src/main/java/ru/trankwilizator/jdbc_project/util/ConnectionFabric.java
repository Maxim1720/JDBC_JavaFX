package ru.trankwilizator.jdbc_project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFabric {

    public static Connection createConnection(){
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/employees"
                    , "postgres"
                    , "postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
