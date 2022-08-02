package ru.trankwilizator.jdbc_project.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import ru.trankwilizator.jdbc_project.exception.NotFoundException;
import ru.trankwilizator.jdbc_project.model.EmployeeData;
import ru.trankwilizator.jdbc_project.service.table.AllEmployeesTableFiller;
import ru.trankwilizator.jdbc_project.service.table.EmployeeByIdTableFiller;
import ru.trankwilizator.jdbc_project.service.table.ITableFiller;
import ru.trankwilizator.jdbc_project.util.NumberChecker;


public class EmployeesController {

    @FXML
    private TextField numberField;
    @FXML
    private TableView<EmployeeData> table;

    public void onShowAllClick(ActionEvent event) {
        fillTable(new AllEmployeesTableFiller(table));
    }

    public void onShowEmployee(ActionEvent actionEvent) {
        if(NumberChecker.isNumber(numberField.getText())){
           trySetEmployee();
        }
        else {
            alertError("Неверный номер сотрудника",
                    "Номер сотрудника состоит из цифр");
        }
    }

    private void trySetEmployee(){
        try {
            int number = Integer.parseInt(numberField.getText());
            fillTable(new EmployeeByIdTableFiller(table,number));
        }
        catch (NotFoundException e){
            alertError("Сотрудник не найден", e.getMessage() + ": id = " + e.getId());
        }
    }
    private void fillTable(ITableFiller tableFiller){
        table = tableFiller.getFilled();
    }

    private void alertError(String header, String content){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.setOnCloseRequest((e)->{
            numberField.clear();
        });
        alert.show();
    }


}
