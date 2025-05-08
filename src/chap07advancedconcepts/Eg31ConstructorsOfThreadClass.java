package chap07advancedconcepts;

class NewThread extends Thread {
    public NewThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;

        while (i < 10) {
            System.out.println("I am a new thread.");
            i++;
        }
    }
}

public class Eg31ConstructorsOfThreadClass {
    public static void main(String[] args) {
        NewThread thread1 = new NewThread("Kushal");
        NewThread thread2 = new NewThread("Kushal Prasad Joshi");

        thread1.start();
        thread2.start();

        System.out.println("The id of the thread thread1 is " + thread1.getId());
        System.out.println("The name of the thread thread1 is " + thread1.getName());

        System.out.println("The id of the thread thread2 is " + thread2.getId());
        System.out.println("The name of the thread thread2 is " + thread2.getName());
    }
}
