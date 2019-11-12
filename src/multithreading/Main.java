package multithreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        SimpleThread thread = new SimpleThread();
        thread.start();

        thread.interrupt();

        Thread.sleep(300);

        SimpleThread thread1 = new SimpleThread();
        thread1.start();

        Thread.sleep(300);

        Thread thread2 = new Thread(new SimpleRunner());
        thread2.start();

        Thread thread3 = new Thread(() -> {
            System.out.println("Hello from lambda Runnable");
        });
        thread3.start();

        new Thread(() ->
                System.out.println("Hello from lambda Runnable Short")
        ).start();

        System.out.println(Thread.currentThread().getName() + ": Test");

    }

}

class SimpleThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(SimpleThread.currentThread().getName() + " was interrupted ");
                return;
            }
            System.out.println(ColorScheme.RED + SimpleThread.currentThread().getName() + " : " + i);
        }
    }
}

class SimpleRunner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(ColorScheme.GREEN + Thread.currentThread().getName() + " : " + i);
        }
    }
}
