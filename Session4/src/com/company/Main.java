package com.company;

public class Main {

    public static void main(String[] args) {
        // Math methods
        System.out.println(Math.max(10, 4));
        System.out.println(Math.min(10, 4));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.abs(-10));
        System.out.println(Math.random()); // [0,1)
        System.out.println(Math.floor(10.7f));
        System.out.println(Math.round(10.7f));

        // Arithmetic operators
        int x = 5;
        int y = 10;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(y / x);
        System.out.println(y % 3);
        x++; // x = x + 1
        System.out.println(x);
        y--; // y = y - 1
        System.out.println(y);
        x += 4;
        System.out.println(x);
        x -= 4;
        System.out.println(x);
        x *= 4;
        System.out.println(x);
        x /= 4; // x = x / 4
        System.out.println(x);
        x %= 4; // x = x % 4
        System.out.println(x);

        // Comparison operators
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x >= y);

        // Logical operators
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(!true);

        // Bitwise operators
        System.out.println(5 & 3);
        System.out.println(5 | 3);
        System.out.println(5 ^ 3);
        System.out.println(5 << 3);
        System.out.println(5 >> 3);


    }

}