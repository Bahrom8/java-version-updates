package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,1,3,2,4,6,5);
        list.forEach(System.out::println);

        System.out.println("--------------FILTER---------------------");

        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        System.out.println("--------------DISTINCT---------------------");

        list.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        /* another option
        Stream<Integer> str = list.stream()
                .filter(i -> i % 2 == 0)
                .distinct();
        str.forEach(System.out::println);
         */

        System.out.println("--------------LIMIT---------------------");

        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("--------------SKIP---------------------");

        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("--------------MAP---------------------");

        list.stream()
                .map(number -> number * 2)
                .filter(number -> number % 3 == 0)
                .distinct()
                .forEach(System.out::println);




    }
}
