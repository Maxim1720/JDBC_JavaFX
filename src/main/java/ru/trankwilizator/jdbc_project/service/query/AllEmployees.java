package ru.trankwilizator.jdbc_project.service.query;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ru.trankwilizator.jdbc_project.model.EmployeeData;
import ru.trankwilizator.jdbc_project.util.ColumnLabels;
import ru.trankwilizator.jdbc_project.util.Queries;

import java.util.List;

public class AllEmployees implements QueryExecutor {
    @Override
    public ObservableList<EmployeeData> execute() {
        return FXCollections.observableArrayList(new FullEmployeeDataGetter().getAll());
    }
    @Override
    public List<String> labels() {
        return ColumnLabels.labels(Queries.getAllEmployeesData());
    }

}
