package exceptionfolder;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(1 / 0);
            System.out.println(numbers[5]);
        } catch (Exception e) {
            System.out.println(e.getStackTrace()[0].getLineNumber());
        }
        System.out.println("salam");
    }
}
