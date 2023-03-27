package com.cydeo.employeeregitrationproject.bootstrap;

import com.cydeo.employeeregitrationproject.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    private static List<Employee> employeeList = new ArrayList<>();

    public static void saveEmployee(Employee employee){
        employeeList.add(employee);
    }

    public static List<Employee> getEmployeeList(){
        return employeeList;
    }


    public static List<String> getAllStates(){
        return Arrays.asList(
                "Alabama",
                "Montana",
                "Alaska",
                "Nebraska",
                "Arizona",
                "Nevada",
                "Arkansas",
                "NewHampshire",
                "California",
                "NewJersey",
                "Colorado",
                "NewMexico",
                "Connecticut",
                "NewYork",
                "Delaware",
                "NorthCarolina",
                "Florida",
                "NorthDakota",
                "Georgia",
                "Ohio",
                "Hawaii",
                "Oklahoma",
                "Idaho",
                "Oregon",
                "Illinois",
                "Pennsylvania",
                "Indiana",
                "RhodeIsland",
                "Iowa",
                "SouthCarolina",
                "Kansas",
                "SouthDakota",
                "Kentucky",
                "Tennessee",
                "Louisiana",
                "Texas",
                "Maine",
                "Utah",
                "Maryland",
                "Vermont",
                "Massachusetts",
                "Virginia",
                "Michigan",
                "Washington",
                "Minnesota",
                "WestVirginia",
                "Mississippi",
                "Wisconsin",
                "Missouri",
                "Wyoming"
        );
    }

}
