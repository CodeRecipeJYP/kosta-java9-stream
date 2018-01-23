package com.asuscomm.yangyicompany.l_group;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupMain {
    public static void main(String[] args) {
        List<Transaction> transactions =
                Arrays.asList(new Transaction(Currency.EUR, 1500.0),
                        new Transaction(Currency.USD, 2300.0),
                        new Transaction(Currency.GBP, 9900.0),
                        new Transaction(Currency.EUR, 1100.0),
                        new Transaction(Currency.JPY, 7800.0),
                        new Transaction(Currency.CHF, 6700.0),
                        new Transaction(Currency.EUR, 5600.0),
                        new Transaction(Currency.USD, 4500.0),
                        new Transaction(Currency.CHF, 3400.0),
                        new Transaction(Currency.GBP, 3200.0),
                        new Transaction(Currency.USD, 4600.0),
                        new Transaction(Currency.JPY, 5700.0),
                        new Transaction(Currency.EUR, 6800.0) );

        Map<Currency, List<Transaction>> collect = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCurrency));

        System.out.println(collect);

        Map<Currency, Double> collectSumming = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCurrency,
                        Collectors.summingDouble(Transaction::getValue)));

        System.out.println(collectSumming);

    }

    public static class Transaction {
        private final Currency currency;
        private final double value;

        public Transaction(Currency currency, double value) {
            this.currency = currency;
            this.value = value;
        }

        public Currency getCurrency() {
            return currency;
        }

        public double getValue() {
            return value;
        }

        @Override
        public String toString() {
            return currency + " " + value;
        }
    }

    public enum Currency {
        EUR, USD, JPY, GBP, CHF
    }
}
