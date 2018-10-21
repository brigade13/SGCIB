package main.org.sg.kata;

import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.lang.Integer.valueOf;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.of;

import java.util.stream.*;

/**
 * @author Imed BOUBAKER
 * FooBarQix analysis class
 */
public class FooBarQix {

    public static final String[] CORRESPONDING_VALUES = {"", "", "", "Foo", "", "Bar", "", "Qix", "", ""};

    public static String compute(final String value) {
        final String result = convertToFooBarQix(concat(toDivisorsAnalysis(value), toDigitsAnalysis(value)));
        if (result.isEmpty()) {
            return value;
        } else {
            return result;
        }
    }

    static String convertToFooBarQix(final Stream<Integer> stream) {
        return stream.map(v -> CORRESPONDING_VALUES[v]).collect(joining());
    }

    static Stream<Integer> toDigitsAnalysis(final String value) {
        return stream(value.split("")).map(Integer::valueOf);
    }

    static Stream<Integer> toDivisorsAnalysis(final String value) {
        return of(3, 5, 7).filter(isDivisibleNumber(valueOf(value)));
    }

    private static Predicate<Integer> isDivisibleNumber(final int number) {
        return n -> number % n == 0;
    }

    /**
     * Main method that prints numbers from 1 to 100, one number per line.
     * For each printed number, we use the following rules:
     * if the number is divisible by 3 or contains 3, replace 3 by "Foo";
     * if the number is divisible by 5 or contains 5, replace 5 by "Bar";
     * if the number contains 7, replace by "Qix";
     *
     * @param args
     */
    public static void main(String args[]) {
        IntStream.range(1, 100).forEach(nbr -> System.out.println(FooBarQix.compute(Integer.toString(nbr))));
    }
}

