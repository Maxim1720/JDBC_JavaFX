package ru.trankwilizator.jdbc_project.service.table;

import javafx.scene.control.TableView;
import ru.trankwilizator.jdbc_project.model.EmployeeData;
import ru.trankwilizator.jdbc_project.service.query.AllEmployees;

public class AllEmployeesTableFiller extends TableFiller{
    public AllEmployeesTableFiller(TableView<EmployeeData> tableView){
        super(tableView, new AllEmployees());
    }
}
