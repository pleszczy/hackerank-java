package com.piotr;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.*;

class Result {

    public static void plusMinus(List<Integer> arr) {
        double total = arr.size();
        Map<Integer, List<Integer>> grouped = arr.stream()
                .collect(Collectors.groupingBy(it -> Integer.compare(it, 0)));

        System.out.println(roundPrecision(grouped.getOrDefault(1, List.of()).size() / total));
        System.out.println(roundPrecision(grouped.getOrDefault(-1, List.of()).size() / total));
        System.out.println(roundPrecision(grouped.getOrDefault(0, List.of()).size() / total));
    }

    private static BigDecimal roundPrecision(Double number) {
        return BigDecimal.valueOf(number)
                .setScale(6, RoundingMode.HALF_UP);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Result.plusMinus(List.of(-4, 3, -9, 0, 4, 1));
        Result.plusMinus(List.of(1, -2, -7, 9, 1, -8, -5));
    }
}
