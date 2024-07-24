package com.cydeo.Task;

import java.util.Arrays;
import java.util.List;

public class StateTaskTest {

    public static void main(String[] args) {

        State CA = new State();
        CA.addCity("\tBig cities in California \n");
        CA.addCity("Los Angeles, ");
        CA.addCity("San Francisco, ");
        CA.addCity("San Jose, ");
        CA.addCity("San Diego, ");
        CA.addCity("Sacramento \n");

        State NV = new State();
        NV.addCity("\tBig cities in Nevada \n");
        NV.addCity("Las Vegas, ");
        NV.addCity("Reno, ");
        NV.addCity("Henderson\n");

        State TX = new State();
        TX.addCity("\tBg cities in Texas \n");
        TX.addCity("Dallas, ");
        TX.addCity("Huston, ");
        TX.addCity("Austin, ");
        TX.addCity("San Antonio\n");

        State FL = new State();
        FL.addCity("\tBig cities in Florida \n");
        FL.addCity("Miami, ");
        FL.addCity("Orlando, ");
        FL.addCity("Jacksonville, ");
        FL.addCity("Pensacola, ");
        FL.addCity("Tampa\n");

        State NY = new State();
        NY.addCity("\tBig cities in New York \n");
        NY.addCity("New York, ");
        NY.addCity("Albany, ");
        NY.addCity("Rochester, ");
        NY.addCity("Buffalo\n");

        List<State> listOfStates = Arrays.asList(CA, NV, TX, FL, NY);
        listOfStates.stream()
                .map(state -> state.getCities())
                .flatMap(List::stream)
                .forEach(System.out::print);


    }


}
/*
Suppose we have a State class that contains list of cities. Create a list
of States and print all the cities.
 */
