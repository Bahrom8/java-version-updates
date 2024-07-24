package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;

import javax.print.attribute.IntegerSyntax;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);
        int sumOf = 0;
        for (int number : numbers){
            sumOf = sumOf + number;
        }
        System.out.println(sumOf);

        System.out.println("----Reduce------");

        int result = numbers.stream().reduce(0, (a,b) -> a + b);
        Optional<Integer> result2 = numbers.stream().reduce( (a, b) -> a + b);
        System.out.println(result);
        System.out.println(result2.get());

        System.out.println("Dish calories total: ");
        int calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
                //.reduce((a,b) -> a + b)
                .reduce(Integer::sum)
                .get();
        System.out.println(calTotal);

        //MAx and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Max: " + max.get());
        System.out.println("Min: " + min.get());
        System.out.println("Sum: " + sum.get());

        System.out.println("-----COUNT------");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);


    }
}
