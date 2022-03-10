package startThreads;

public class Main3 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main3 thread = new Main3();
        thread.start();
        System.out.println(amount);
        amount++;
        while (thread.isAlive())
            System.out.println("waiting... ");
        System.out.println(amount);
    }

    public void run() {
        amount++;
        System.out.println(amount);
    }
}
