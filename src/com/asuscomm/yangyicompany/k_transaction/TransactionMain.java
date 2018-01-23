package com.asuscomm.yangyicompany.k_transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TransactionMain {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        System.out.println("");
        System.out.println("Query 1: Find all transactions from year 2011 and sort them by value (small to high).");
        transactions.stream().parallel()
                .filter(transaction -> transaction.getYear() >= 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
//                .forEachOrdered(System.out::println);
                .forEach(System.out::println);



        // Query 2: What are all the unique cities where the traders work?
        System.out.println("");
        System.out.println("Query 2: What are all the unique cities where the traders work?");
        transactions.stream().map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);



        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("");
        System.out.println("Query 3: Find all traders from Cambridge and sort them by name.");
        transactions.stream().map(Transaction::getTrader)
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);


        // Query 4: Return a string of all traders’ names sorted alphabetically.
        System.out.println("");
        System.out.println("Query 4: Return a string of all traders’ names sorted alphabetically.");
        Optional<String> reduce = transactions.stream().map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted(String::compareTo)
                .reduce((String s1, String s2) -> s1 + s2);

        System.out.println(reduce.get());



        // Query 5: Are there any trader based in Milan?
        System.out.println("");
        System.out.println("Query 5: Are there any trader based in Milan?");
        boolean b = transactions.stream().map(Transaction::getTrader)
                .map(Trader::getCity)
                .anyMatch("Millan"::equals);

        System.out.println(b);



        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        System.out.println("");
        System.out.println("Query 6: Update all transactions so that the traders from Milan are set to Cambridge.");
        System.out.println("Before query");
        transactions.stream().forEach(System.out::println);
        transactions.stream().map(Transaction::getTrader)
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .forEach(trader -> trader.setCity("Milan"));
        System.out.println("After query");
        transactions.stream().forEach(System.out::println);



        // Query 7: What's the highest value in all the transactions?
        System.out.println("");
        System.out.println("Query 7: What's the highest value in all the transactions?");
        int asInt = transactions.stream().mapToInt(Transaction::getValue)
                .max().getAsInt();
        System.out.println("Answer : " + asInt);
    }
}
