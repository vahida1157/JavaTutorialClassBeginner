import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }
        int number = 5;
        do {
            System.out.println(number);
            number++;
        } while (number < 10);

        Scanner scanner = new Scanner(System.in);
        int naturalNumber;
        double sqrt;
        do {
            System.out.println("Enter your number: ");
            number = scanner.nextInt();
            sqrt = Math.sqrt(number);
            naturalNumber = ((int) sqrt);
        } while (naturalNumber != sqrt && number < 100);
        System.out.println(number);
    }
}
