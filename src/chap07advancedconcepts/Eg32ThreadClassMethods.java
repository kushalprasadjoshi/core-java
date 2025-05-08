package chap07advancedconcepts;

class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Eg32ThreadClassMethods {
    public static void main(String args[]) {
        ThreadExample thread1 = new ThreadExample();
        ThreadExample thread2 = new ThreadExample();

        System.out.println("Id of thread1: " + thread1.getId());
        System.out.println("Name of thread1: " + thread1.getName());

        System.out.println("Id of thread2: " + thread2.getId());
        System.out.println("Name of thread2: " + thread2.getName());

        thread1.setName("Thread A");
        thread2.setName("Thread B");

        System.out.println("After changing name of thread1: " + thread1.getName());
        System.out.println("After changing name of thread2: " + thread2.getName());
    }
}
