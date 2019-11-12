package multithreading;

public class MyFirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("Выполнен поток " + getName());
    }
}


class MyMain {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            MyFirstThread thread = new MyFirstThread();
            thread.start();
            System.out.println(thread.getName());
        }
    }
}
