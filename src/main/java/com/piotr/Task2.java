package com.piotr;

import java.util.List;


public class Task2 {

    public static void miniMaxSum(List<Integer> arr) {
        List<Integer> sortedArr = arr
                .stream()
                .sorted()
                .toList();

        var min = sortedArr
                .subList(0, 4)
                .stream()
                .mapToLong(it -> it)
                .sum();

        var max = sortedArr
                .subList(1, 5)
                .stream()
                .mapToLong(it -> it)
                .sum();

        System.out.printf("%d %d", min, max);
    }

    public static void main(String[] args) {
        miniMaxSum(List.of(7, 69, 2, 221, 8974));
    }
}
