package chap06oop;

class MyClass {
    private int number; // Instance variable

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        // this.number refers to instance variable and number refers to parameter of setter
    }
}

public class Eg04ThisKeyword {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.setNumber(45);
        System.out.println(myObject.getNumber());
    }
}
