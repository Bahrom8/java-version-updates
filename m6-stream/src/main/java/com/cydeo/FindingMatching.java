package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        System.out.println("-----ALL MATCH-----");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        System.out.println("-----ANY MATCH-----");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("-----NONE MATCH-----");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        System.out.println("-----FIND ANY-----");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("-----FIND FIRST-----");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish2.get());

        //PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(1, 100).parallel().findAny().getAsInt());
        System.out.println(IntStream.range(1, 100).parallel().findFirst().getAsInt());

        List<String> list1 = Arrays.asList("Johnny", "David","Jack", "Duke", "Jill", "Danny", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Johnny", "David","Jack", "Duke", "Jill", "Danny", "Julia", "Jenish", "Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        System.out.println("-----MIN-----");
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        System.out.println("-----MAX-----");
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());


    }

}
