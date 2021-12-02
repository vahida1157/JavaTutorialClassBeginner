package com.company;

public class Main {

    public static void main(String[] args) {
	    // print
        System.out.println("Hello world");
        System.out.println("1 + 2");
        System.out.println(1 + 2); // 3
        System.out.println("Hello world" + 1); // Hello world1
        System.out.println("Hello world" + " my dears"); // Hello world my dears
        System.out.println(1 + "Hello world"); // 1Hello world
        System.out.println("A" + 1 + 2); // A12
        System.out.println("A" + (1 + 2)); // A12
        System.out.println(1 + 2 + "A"); // "3" + "A" = 3A
        System.out.println(1 + 2 + "A" + 3); //3A3

        System.out.println(2 * 3); // 6
        System.out.println(2 * 2 + "A"); // 4A
        System.out.println("A" + 2 * 2); // A4
    }
}
