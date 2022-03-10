package finalyFolder;

import createException.IsNotSquareException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(createException.Main.findSquare(16));
            System.out.println(1 / 0);
        } catch (IsNotSquareException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("code ended.");
        }


        try {
            System.out.println(1 / 0);
        } finally {
            System.out.println("code ended.");
        }
    }
}
