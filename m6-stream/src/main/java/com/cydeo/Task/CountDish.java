package com.cydeo.Task;

import java.util.Optional;

public class CountDish {

    public static void main(String[] args) {

        long dishCount = DishData.getAll().stream()
                .map(Dish::getName).count();
        System.out.println(dishCount);


    }

}
/*
How would you count the number of dishes in a stream using the map and reduce methods?
 */
