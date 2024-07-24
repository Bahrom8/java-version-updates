package com.cydeo.Task;

import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        System.out.println("---------Task_1---------------");
        //Print all dish's name that less than 400 calories

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
     //         .map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("---------Task_2---------------");
        //Print the length of the name of each the dish

        DishData.getAll().stream()
                .map(Dish::getName)
    //          .map(dish -> dish.length())
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("---------Task_3---------------");
        //Print three high caloric dish names (>300)

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---------Task_4---------------");
        //Print all dish names that are below 400 calories in sorted

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);
    }

}
