package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ProArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vahid");
        names.add("reza");
        names.add("maryam");
        names.add("mina");
        names.add("vida");
        names.add("NAVID");
        if (names.contains("ali")) {
            System.out.println(names);
        }
        System.out.println(names.get(2));

        Scanner scanner = new Scanner(System.in);
        String ch = scanner.nextLine();
        for (String name : names) {
            if (name.toLowerCase().contains(ch.toLowerCase())) {
                System.out.println(name.toUpperCase());
            }
        }
    }
}
