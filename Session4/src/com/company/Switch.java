package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek_String = scanner.nextLine();
        int dayOfWeek = Integer.parseInt(dayOfWeek_String);
        switch (dayOfWeek) {
            case 1: // dayOfWeek == 1
                System.out.println("Saturday");
                break;
            case 2: // dayOfWeek == 2
                System.out.println("Sunday");
                break;
            case 3: // dayOfWeek == 3
                System.out.println("Monday");
                break;
            case 4: // dayOfWeek == 4
                System.out.println("Thursday");
                break;
            case 5: // dayOfWeek == 5
                System.out.println("Wednesday");
                break;
            case 6: // dayOfWeek == 6
                System.out.println("Tuesday");
                break;
            case 7: // dayOfWeek == 7
                System.out.println("Friday");
                break;
            default: // not handled
                System.out.println("please inter current number");
                break;
        }
    }
}
