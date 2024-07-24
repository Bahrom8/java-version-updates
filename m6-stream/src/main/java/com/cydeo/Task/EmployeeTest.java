package com.cydeo.Task;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //Print all emails
        System.out.println("-------------Print all emails------------------");
        EmployeeData.readAll()
                //.map(employee -> employee.getEmail())
                .map(Employee::getEmployeeEmail)
                .forEach(System.out::println);

        //Print all phone numbers
        System.out.println("-------------Print all phone numbers------------------");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmployeePhoneNumbers().stream())
                .forEach(System.out::println);

        //Print all phone numbers
        System.out.println("------Print all phone numbers with double colon operator------");
        EmployeeData.readAll()
                .map(Employee :: getEmployeePhoneNumbers)
                .flatMap(List :: stream)
                .forEach(System.out::println);


    }
}
