package ru.trankwilizator.jdbc_project.util;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColumnLabels {

    public static List<String> labels(String query){
        List<String> labels = new ArrayList<>();
        try {
            ResultSetMetaData metaData = ConnectionFabric.createConnection()
                    .createStatement()
                    .executeQuery(query)
                    .getMetaData();

            for(int i=1;i<=metaData.getColumnCount();i++){
                labels.add(metaData.getColumnLabel(i));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return labels;
    }

}
