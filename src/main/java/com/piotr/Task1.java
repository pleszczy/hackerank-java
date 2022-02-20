package com.piotr;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Task1 {

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

    public static void main(String[] args) {
        plusMinus(List.of(-4, 3, -9, 0, 4, 1));
        plusMinus(List.of(1, -2, -7, 9, 1, -8, -5));
    }
}
