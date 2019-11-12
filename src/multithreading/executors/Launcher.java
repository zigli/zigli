package multithreading.executors;

import static multithreading.ColorScheme.RED;

public class Launcher {
    public static void main(String[] args) {
        System.out.println(RED + "Starting daemon main");
        GCDRunnable r = new GCDRunnable(true);
        runInOneThread(r);
        System.out.println(RED + "Leaving daemon main");

    }

    private static void runInOneThread(GCDRunnable r){
        Thread thread = new Thread(r);
        thread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
