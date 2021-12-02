package com.company;

public class Main {

    public static void main(String[] args) {
        // section 1
        String firstName = "vahid";
        String lastName = "Ghasemi";
        int age = 23;
        float length = 179.5f;
        char character = 'V';
        boolean isAlive = false;

        System.out.println(firstName);
        System.out.println(age);
        System.out.println(length);
        System.out.println(character);
        System.out.println(isAlive);

        //section 2
        int a = 5;
        int b = 10;
        int c = a * b;
        System.out.println(c);

        // section 3
        int years = 5;
        int month = 12;
        int allMonth = years * month;
        System.out.println(allMonth);

        // section 4 (casting Widening)
        byte x = 100;
        float f = x;
        System.out.println(x);
        System.out.println(f);

        // section 5 (casting Narrowing)
        float f1 = 100.9f;
        int i = (int) f1;
        System.out.println(i);

        char c1 = 'A';
        byte b1 = (byte) c1;
        System.out.println(b1);


    }
}
