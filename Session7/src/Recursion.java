public class Recursion {


    public static void main(String args[]) {
        int n = 50;
        System.out.println(fib(n));
    }

    static long fib(long n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
