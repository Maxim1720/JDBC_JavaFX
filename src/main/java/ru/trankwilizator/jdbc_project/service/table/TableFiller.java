package ru.trankwilizator.jdbc_project.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import ru.trankwilizator.jdbc_project.model.EmployeeData;
import ru.trankwilizator.jdbc_project.service.query.AllEmployees;
import ru.trankwilizator.jdbc_project.service.query.EmployeeById;
import ru.trankwilizator.jdbc_project.util.ColumnsLabel;
import ru.trankwilizator.jdbc_project.util.Queries;

import java.util.List;

public class TableFiller {
    private final TableView<EmployeeData> table;
    public TableFiller(TableView<EmployeeData> tableView){
        this.table = tableView;
        table.getItems().clear();
    }

    public TableView<EmployeeData> getFilledByAllEmployees() {
        fillTable(new AllEmployees());
        return table;
    }

    public TableView<EmployeeData> getFilledById(Integer id){
        fillTable(new EmployeeById(id));
        return table;
    }

    private void fillTable(QueryExecutor queryExecutor){
        setTableHeaders(queryExecutor.labels());
        setTableItems(queryExecutor.execute());
    }

    private void setTableHeaders(List<String> labels){
        table.getColumns().clear();
        for (String l:labels) {
            TableColumn<EmployeeData, String> tableColumn = new TableColumn<>(l);
            l = prepareHeader(l);
            tableColumn.setCellValueFactory(new PropertyValueFactory<>(l));
            table.getColumns().add(tableColumn);
        }
    }
    private void setTableItems(ObservableList<EmployeeData> items){
        table.setItems(items);
        table.refresh();
    }

    private String prepareHeader(String l){
        String[] propertyValues = l.split("\s", 0);
        if(propertyValues.length > 1){
            StringBuilder secondWord = new StringBuilder(propertyValues[propertyValues.length - 1]);
            secondWord.replace(0,1,String.valueOf(secondWord.charAt(0)).toUpperCase());
            l = propertyValues[0] + secondWord;
        }
        return l;
    }

}
