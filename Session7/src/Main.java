import java.util.Random;

public class Main {

    static int x;
    public static void main(String[] args) {
//        System.out.println(multipleByTwo(5, 10));
//        System.out.println(multipleByTwo(15, 3));
//        String welcomeText = sayHello("ali", "nazari");
//        System.out.println(welcomeText);
//        System.out.println(sayHello("vahid", "ghasemi"));

//        System.out.println(calculateAreaCircle(10));
//        starGenerator(5);

        System.out.println(sayHello("vahid", "ghasemi"));

    }

    static String sayHello(String name) {
        return "Hello " + name + x;
    }

    static String sayHello(String name, String family) {
        return "Hello " + name + " " + family;
    }

    static void myMethod(String thing) {
        System.out.println("I just got, " + thing + "!");
    }

    static int multipleByTwo(int x, int y) {
        System.out.println("calculating ...");
        return y * x;
    }

    static void starGenerator(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "*";
        }
        System.out.println(result);
    }

    static float calculateAreaCircle(int radius) {
        return 3.14f * radius * radius;
    }

    static float generateRandomNumber() {
        Random random = new Random();
        float x = calculateAreaCircle(10);
        float rand1 = random.nextFloat();
        int rand2 = random.nextInt();
        return x * rand1 * rand2;
    }
}
