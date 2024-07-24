package com.cydeo.Task;


import java.util.Comparator;
import java.util.Optional;

public class TransactionTest {

    public static void main(String[] args) {

        System.out.println("-1st-----Sorting--(small to high)-------");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("-2nd-----Unique cities---------");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("-3rd-----Sorting (by Cambridge)---------");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("-4th-----Sorting (alphabetically)---------");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-5th-----Milan only---------");
        boolean milanOnly = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Milan"));

        System.out.println(milanOnly);

        System.out.println("-6th-----from Cambridge---------");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("-7th-----Highest value---------");
        Optional<Integer> highest = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .max(Comparator.naturalOrder());
        System.out.println(highest.get());

        System.out.println("-8th-----Lowest value---------");
        Optional<Integer> lowest = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .min(Comparator.naturalOrder());
        System.out.println(lowest.get());



    }


}
/*
1. Find all transactions in the year 2011 and sort them by value(small to high)
2. What are all the unique cities where the traders work?
3. Find all traders from Cambridge and sort them by name.
4. Return a string of all traders’ names sorted alphabetically.
5. Are any traders based in Milan?
6. Print the values of all transactions from the traders living in Cambridge.
7. What is the highest value of all the transactions?
8. Find the transaction with the smallest value.
 */
