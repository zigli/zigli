package multithreading;

public class Clock extends Thread {

    public static void main(String[] args){
        MyClock clock = new MyClock();
        clock.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        clock.interrupt();
    }
}

class MyClock extends Thread{
    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted())
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Работа потока была прервана");
                break;
            }
            System.out.println("Tik");
        }
    }
}