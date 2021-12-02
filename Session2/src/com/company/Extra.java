package com.company;

public class Extra {
    public static void main(String[] args) {
        int numberOfValue;
        numberOfValue = 10;
        System.out.println(numberOfValue);

        String firstName = "Vahid";
        String lastName = "Ghasemi";
        int age = 23;
        float length = 179.5f;
        char character = 'V';
        boolean isAlive = true;

        System.out.println("My name is : " + firstName + " " + lastName + " , I have " + age + " year(s) old");
        System.out.println("My stature is " + length + ".");
        System.out.println("My alive state : " + isAlive);

        System.out.println("My name is : " + "\"" + firstName + " " + lastName + "\"");
        System.out.println("My name is : " + '"' + firstName + " " + lastName + '"');

        System.out.print("salam");
        System.out.print("bye");

        System.out.printf("Hello %s your age is : %d .%n your stature is : %.1f ", firstName, age, length);

    }
}
