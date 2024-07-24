package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;
import com.cydeo.Task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7, 6, 7, 8);

        System.out.println("-----To Collection-----");
        //is used to create a Collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        System.out.println("-----To List-----");
        //returns a Collector interface that gathers the input data into a new list
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println("-----To Set-----");
        //returns a Collector interface that gathers the input data into a new set
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        System.out.println("-----To Map-----");
        //(Function, Function): returns a Collector interface that gathers the input data into a new map
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        System.out.println("-----Summing Int-----");
        //(ToIntFunction): returns a Collector that produces the sum of an Integer-valued function
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("-----Counting-----");
        //returns a Collector that counts the number of the elements
        Long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        System.out.println("-----AveragingInt-----");
        //returns the average of the integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        System.out.println("-----Joining-----");
        //is used to join various elements of a characters or string array into a single object
        List<String> courses = Arrays.asList("Java", "JS", "Python");
        String str = courses.stream()
                .collect(Collectors.joining(", "));
        System.out.println(str);

        System.out.println("-----partitioningBy-----");
        //is used to partitioning a stream of objects (or a set of elements) based on given predicate
        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        System.out.println("-----groupingBy-----");
        //is used for grouping objects by some property and storing results in a Map instance
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);





    }

}
