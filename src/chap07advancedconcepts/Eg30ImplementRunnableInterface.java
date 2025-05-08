package chap07advancedconcepts;

class ThreadImplementingRunnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Bullet firing from gun1");
            i++;
        }
    }
}

class ThreadImplementingRunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Bullet firing from gun2");
            i++;
        }
    }
}

public class Eg30ImplementRunnableInterface {
    public static void main(String[] args) {
        ThreadImplementingRunnable1 bullet1 = new ThreadImplementingRunnable1();
        Thread gun1 = new Thread(bullet1); // Start method cannot be called directly if Runnable interface is implemented
        gun1.start(); // Create an object of Thread class passing object of class implementing Runnable then call start() method on object

        ThreadImplementingRunnable2 bullet2 = new ThreadImplementingRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();
    }
}
