package multithreading.sync;

public class SynchronizedMain {

    private static int prev = 0;
    private static int curr = 1;
    private static int count =0;

    public static void main(String[] args) {
        new Thread(new FibonacciRunner()).start();
        new Thread(new FibonacciRunner()).start();

    }

    private static void calcNext() {
        synchronized (SynchronizedMain.class) {
            int next = prev + curr;
            prev = curr;
            curr = next;
            count++;
            System.out.println(count + " = " + Thread.currentThread().getName() + " => " +curr);
        }
    }

    private static class FibonacciRunner implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                calcNext();
            }
        }
    }

}
