package ru.trankwilizator.jdbc_project.service.query;

import ru.trankwilizator.jdbc_project.exception.NotFoundException;
import ru.trankwilizator.jdbc_project.model.EmployeeData;
import ru.trankwilizator.jdbc_project.util.ConnectionFabric;
import ru.trankwilizator.jdbc_project.util.Queries;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class FullEmployeeDataGetter {

    public List<EmployeeData> getAll(){
        List<EmployeeData> employees = new ArrayList<>();
        try {
            ResultSet resultSet = executeQuery(Queries.getAllEmployeesData());
            while (resultSet.next()){
                employees.add(prepareResult(resultSet));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    public EmployeeData getById(Integer id) {
        EmployeeData employeeData;
        try {
            employeeData = initEmployeeData(id);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeData;
    }
    private EmployeeData initEmployeeData(Integer id) throws SQLException {
            ResultSet resultSet = executeQuery(Queries.getEmployeeDataById(id));
            if(resultSet.next()) {
                return prepareResult(resultSet);
            }
            else {
                throw throwNotFound(id);
            }
    }

    private ResultSet executeQuery(String q) throws SQLException {
        Connection connection = ConnectionFabric.createConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(q);
        connection.close();
        return resultSet;
    }
    private NotFoundException throwNotFound(Integer id){
        NotFoundException e = new NotFoundException("Employee doesn't exists");
        e.setId(id);
        return e;
    }

    private EmployeeData prepareResult(ResultSet resultSet) throws SQLException {
        EmployeeData employee = new EmployeeData();
        employee.setId(resultSet.getInt("id"));
        employee.setName((resultSet.getString("name")));
        employee.setSalary((resultSet.getBigDecimal("salary").doubleValue()));
        employee.setCategoryName((resultSet.getString("category name")));
        employee.setSubdivisionId((resultSet.getInt("subdivision id")));
        employee.setSubdivisionName((resultSet.getString("subdivision name")));
        employee.setSubdivisionCity((resultSet.getString("subdivision city")));
        employee.setDischargeEts((resultSet.getInt("discharge ets")));
        employee.setManagerName((resultSet.getString("manager name")));
        return employee;
    }

}
