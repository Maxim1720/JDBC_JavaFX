package ru.trankwilizator.jdbc_project.service.query;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ru.trankwilizator.jdbc_project.model.EmployeeData;
import ru.trankwilizator.jdbc_project.util.ColumnLabels;
import ru.trankwilizator.jdbc_project.util.Queries;

import java.util.List;

public class EmployeeById implements QueryExecutor {
    private final int id;

    public EmployeeById(int id) {
        this.id = id;
    }

    @Override
    public ObservableList<EmployeeData> execute() {
        return FXCollections.observableArrayList(new FullEmployeeDataGetter().getById(id));
    }
    @Override
    public List<String> labels() {
        return ColumnLabels.labels(Queries.getEmployeeDataById(id));
    }
}
