package com.cydeo.Task;

import java.util.Arrays;
import java.util.List;

public class SquareOfNumber {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        num.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

    }

}
/*
Given a list of number how would you return a list of the square of each
number? For example, given [1,2,3,4,5] you should return [1,4,9,16,25]
 */
