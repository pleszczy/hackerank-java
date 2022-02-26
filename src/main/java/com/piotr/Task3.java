package com.piotr;

import java.util.Objects;

public class Task3 {

    public static String timeConversion(String s) {
        var date = s.substring(0, 8).split(":");
        var amPm = s.substring(8, 10);

        if (!Objects.equals("AM", amPm)) {
            date[0] = String.valueOf(Integer.parseInt(date[0]) + 12);
        }

        if (Objects.equals("24", date[0])) {
            date[0] = "12";
        }

        if (Objects.equals("AM", amPm) && Objects.equals("12", date[0])) {
            date[0] = "00";
        }

        return String.join(":", date);
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45AM"));
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:05:45AM"));
        System.out.println(timeConversion("12:45:54PM"));
    }
}
