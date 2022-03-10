package startThreads;

public class Main2 implements Runnable {
    public static void main(String[] args) {
        Main2 m = new Main2();
        Thread thread = new Thread(m);
        thread.start();
        System.out.println("outside thread");
    }

    @Override
    public void run() {
        System.out.println("inside thread");
    }
}
