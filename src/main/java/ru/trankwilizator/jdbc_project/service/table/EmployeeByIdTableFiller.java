package ru.trankwilizator.jdbc_project.service.table;

import javafx.scene.control.TableView;
import ru.trankwilizator.jdbc_project.model.EmployeeData;
import ru.trankwilizator.jdbc_project.service.query.EmployeeById;
import ru.trankwilizator.jdbc_project.service.query.QueryExecutor;

public class EmployeeByIdTableFiller extends TableFiller{
    public EmployeeByIdTableFiller(TableView<EmployeeData> tableView, int id) {
        super(tableView, new EmployeeById(id));
    }
}
