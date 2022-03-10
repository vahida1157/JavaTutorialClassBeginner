package startThreads;

public class Main extends Thread {
    public static void main(String[] args) {
        Main m = new Main();
        m.start();
        System.out.println("This code is outside of the thread");
    }

    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
