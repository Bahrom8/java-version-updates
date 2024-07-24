package com.cydeo.Task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "Apple", "Honda", "Developer");

        words.stream()
                .map(str -> str.length())
                .forEach(System.out::println);

    }
}

/*
    Task
Given a list of words, print the number of characters for each word
 */
