package ru.trankwilizator.jdbc_project.model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeData {
    /*private final SimpleIntegerProperty id;
    private final SimpleStringProperty name;
    private final SimpleDoubleProperty salary;
    private final SimpleStringProperty categoryName;
    private final SimpleIntegerProperty subdivisionId;
    private final SimpleStringProperty subdivisionName;
    private final SimpleStringProperty subdivisionCity;
    private final SimpleIntegerProperty dischargeEts;
    private final SimpleStringProperty managerName;*/
    private int id;
    private String name;
    private double salary;
    private String categoryName;
    private int subdivisionId;
    private String subdivisionName;
    private String subdivisionCity;
    private int dischargeEts;
    private String managerName;
  /*  public EmployeeData(){

        id = new SimpleIntegerProperty();
        name = new SimpleStringProperty();
        managerName = new SimpleStringProperty();
        subdivisionId = new SimpleIntegerProperty();
        subdivisionCity = new SimpleStringProperty();
        subdivisionName = new SimpleStringProperty();
        salary = new SimpleDoubleProperty();
        categoryName = new SimpleStringProperty();
        dischargeEts = new SimpleIntegerProperty();

    }*/

    /*public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public double getSalary() {
        return salary.get();
    }

    public SimpleDoubleProperty salaryProperty() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary.set(salary);
    }

    public String getCategoryName() {
        return categoryName.get();
    }

    public SimpleStringProperty categoryNameProperty() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName.set(categoryName);
    }

    public int getSubdivisionId() {
        return subdivisionId.get();
    }

    public SimpleIntegerProperty subdivisionIdProperty() {
        return subdivisionId;
    }

    public void setSubdivisionId(int subdivisionId) {
        this.subdivisionId.set(subdivisionId);
    }

    public String getSubdivisionName() {
        return subdivisionName.get();
    }

    public SimpleStringProperty subdivisionNameProperty() {
        return subdivisionName;
    }

    public void setSubdivisionName(String subdivisionName) {
        this.subdivisionName.set(subdivisionName);
    }

    public String getSubdivisionCity() {
        return subdivisionCity.get();
    }

    public SimpleStringProperty subdivisionCityProperty() {
        return subdivisionCity;
    }

    public void setSubdivisionCity(String subdivisionCity) {
        this.subdivisionCity.set(subdivisionCity);
    }

    public int getDischargeEts() {
        return dischargeEts.get();
    }

    public SimpleIntegerProperty dischargeEtsProperty() {
        return dischargeEts;
    }

    public void setDischargeEts(int dischargeEts) {
        this.dischargeEts.set(dischargeEts);
    }

    public String getManagerName() {
        return managerName.get();
    }

    public SimpleStringProperty managerNameProperty() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName.set(managerName);
    }*/
}
