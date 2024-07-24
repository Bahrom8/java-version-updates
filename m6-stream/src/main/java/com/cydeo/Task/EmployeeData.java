package com.cydeo.Task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
      return Stream.of(
        new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("4241234567", "123496789")),
        new Employee(101, "John", "john@cydeo.com", Arrays.asList("1331234512", "823426789")),
        new Employee(102, "Peter", "peter@cydeo.com", Arrays.asList("4279834567", "723436789")),
        new Employee(103, "Alex", "alex@cydeo.com", Arrays.asList("9271232376", "923456781"))
      );
    }

}
