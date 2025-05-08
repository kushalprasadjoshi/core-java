package chap07advancedconcepts;

class ThreadPriorityExample extends Thread {
    public void run() {
        System.out.println("Inside the run() method");
    }
}

public class Eg33ThreadPriorities {
    public static void main(String argvs[]) {
        ThreadPriorityExample thread1 = new ThreadPriorityExample();
        ThreadPriorityExample thread2 = new ThreadPriorityExample();
        ThreadPriorityExample thread3 = new ThreadPriorityExample();

        System.out.println("Before setting priority of thread manually.");
        System.out.println("Priority of the thread thread1 is: " + thread1.getPriority());
        System.out.println("Priority of the thread thread2 is: " + thread2.getPriority());
        System.out.println("Priority of the thread thread3 is: " + thread3.getPriority());

        thread1.setPriority(6);
        thread2.setPriority(3);
        thread3.setPriority(9);

        System.out.println("After setting priority of thread manually.");
        System.out.println("Priority of the thread thread1 is: " + thread1.getPriority());
        System.out.println("Priority of the thread thread2 is: " + thread2.getPriority());
        System.out.println("Priority of the thread thread3 is: " + thread3.getPriority());
    }
}


