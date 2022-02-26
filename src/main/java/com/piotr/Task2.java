package com.piotr;

import java.util.List;


public class Task2 {

    public static void miniMaxSum(List<Integer> arr) {
        var sortedArr = arr
                .stream()
                .sorted()
                .map(Long::valueOf)
                .toList();

        var min = sortedArr
                .subList(0, 4)
                .stream()
                .reduce(Long::sum)
                .get();

        var max = sortedArr
                .subList(1, 5)
                .stream()
                .reduce(Long::sum)
                .get();

        System.out.printf("%d %d", min, max);
    }

    public static void main(String[] args) {
        miniMaxSum(List.of(7, 69, 2, 221, 8974));
    }
}
