package chap06oop;

interface SampleInterface {
    void meth1();
    void meth2();
}

interface ChildSampleInterface extends SampleInterface {
    void meth3();
    void meth4();
}

class SampleClass implements ChildSampleInterface {

    @Override
    public void meth1() {
        System.out.println("Running Method1...");
    }

    @Override
    public void meth2() {
        System.out.println("Running Method2...");
    }

    @Override
    public void meth3() {
        System.out.println("Running Method3...");
    }

    @Override
    public void meth4() {
        System.out.println("Running Method4...");
    }
}

public class Eg17InheritanceInInterfaces {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }

}
