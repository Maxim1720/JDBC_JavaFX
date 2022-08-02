package ru.trankwilizator.jdbc_project.service;

import javafx.collections.ObservableList;
import ru.trankwilizator.jdbc_project.model.EmployeeData;

import java.util.List;

public interface QueryExecutor {
    ObservableList<EmployeeData> execute();
    List<String> labels();
}
