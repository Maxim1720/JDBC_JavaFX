package ru.trankwilizator.jdbc_project.util;

public class Queries {

    public static String getAllEmployeesData(){
        return "select " +
                "e.id, e.name, e.salary, c.name as" +
                " \"category name\",s.id as " +
                "\"subdivision id\", s.name as " +
                "\"subdivision name\", city.name as " +
                "\"subdivision city\", d.number as " +
                "\"discharge ets\", e2.name as " +
                "\"manager name\" from employee as" +
                " e left join category as" +
                " c on e.id_category = c.id left join subdivision as" +
                " s on e.id_subdivision = s.id left join discharge_ets as" +
                " d on s.id_discharge = d.id left join manager as" +
                " m on m.id_subdiv = s.id left join employee as" +
                " e2 on e2.id = m.id_emp left join city on" +
                " city.id = s.id_city;";
    }

    public static String getEmployeeDataById(Integer id){
        return getAllEmployeesData().replace(";", " ") + " where e.id = " + id.toString();
    }

}
