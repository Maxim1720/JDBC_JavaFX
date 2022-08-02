package ru.trankwilizator.jdbc_project.service.table;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import ru.trankwilizator.jdbc_project.model.EmployeeData;
import ru.trankwilizator.jdbc_project.service.query.QueryExecutor;

import java.util.List;

public abstract class TableFiller implements ITableFiller{
    private final TableView<EmployeeData> table;
    private final QueryExecutor queryExecutor;
    public TableFiller(TableView<EmployeeData> tableView, QueryExecutor queryExecutor){
        this.table = tableView;
        this.queryExecutor = queryExecutor;
        table.getItems().clear();
    }

    @Override
    public TableView<EmployeeData> getFilled() {
        fillTable(queryExecutor);
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
