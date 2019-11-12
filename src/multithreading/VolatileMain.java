package multithreading;

import java.util.Random;

public class VolatileMain {

    private  static volatile int counter;

    public static void main(String[] args) {
        new SimpleWriter().start();
        new SimpleReader().start();

    }

    private static class SimpleWriter extends Thread {
        @Override
        public void run() {
            Random rand = new Random();
            for (int i = 1; i < 10; i++) {
                counter = i;
                int r = rand.nextInt(500);
                System.out.println(ColorScheme.RED + SimpleThread.currentThread().getName() + " Write - " + counter + " = " + r);
                try {
                    Thread.sleep(r);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class SimpleReader extends Thread {
        @Override
        public void run() {
            int localCounter = counter;
            Random rand = new Random();
            while (localCounter < 9) {
                if (counter != localCounter) {
                    localCounter = counter;
                    int r = rand.nextInt(500);
                    System.out.println(ColorScheme.GREEN + SimpleThread.currentThread().getName() + " Read  - " + localCounter + " = " + r);
                }


            }
        }
    }
}
