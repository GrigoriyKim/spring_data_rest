package com.gkim.spring.springboot.spring_data_rest.dao;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int result = (seconds < 86400) ? seconds : 0;
        int result2 = (result >= 0) ? result : 0;
        int hours = result2 / 3600;
        int minutes = (result2 % 3600) / 60;
        int sec = result2 % 60;
        System.out.printf("%d:%02d:%02d", hours, minutes, sec);
        scanner.close();
    }
}
