package com.cydeo.Task;

import java.util.Arrays;
import java.util.List;

public class PairNumbers {

    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);

        numbers1.stream()
                .flatMap(i -> numbers2.stream().map(j -> new int[]{i, j}))
                .forEach(pair -> System.out.println(Arrays.toString(pair)));

    }


}
/*
Given two lists of numbers, how would you return all pairs of numbers? For example, given a list
[1,2,3] and a list [3,4] you should return [(1,3),(1,4),(2,3),(2,4),(3,3),(3,4)]
        • List<Integer> numbers1 = Arrays.asList(1,2,3);
        • List<Integer> numbers2 = Arrays.asList(3,4);
        • List<int[]> pairs = ?????
 */
