package com.company;

public class For {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String[] cars = {"Pride", "Persia", "Volvo", "BMW"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String car : cars) { // car = cars[0] , car = cars[1]
            if (car.startsWith("P"))
                System.out.println(car);
        }

        for (int i = 0; i <= 100; i += 3) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
