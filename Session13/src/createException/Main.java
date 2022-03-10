package createException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(findSquare(15));
        } catch (IsNotSquareException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findSquare(int number) throws IsNotSquareException {
        double sqrt = Math.sqrt(number);
        if (sqrt == ((int) sqrt)) {
            return ((int) sqrt);
        } else {
            throw new IsNotSquareException(number + " is not a square");
        }
    }
}
