package chap06oop;

class Phone {
    public void on() {
        System.out.println("Turning on phone...");
    }
    public void showTime() {
        System.out.println("It's 8'o clock.");
    }
}

class SmartPhone extends Phone {
    @Override
    public void on() {
        System.out.println("Turning on smartphone...");
    }
    public void playMusic() {
        System.out.println("Playing music...");
    }
}


public class Eg12DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new Phone();    // Allowed
        SmartPhone obj1 = new SmartPhone();    // Allowed
        obj.showTime(); // Allowed
        obj1.playMusic(); // Allowed

        Phone obj2 = new SmartPhone();  // Yes!! It is Allowed
//        SmartPhone obj3 = new Phone();  // Not Allowed
        obj2.showTime(); // Allowed
        obj2.on(); // Allowed and method of Smartphone (subclass) will be executed.
//        obj2.playMusic(); // Not allowed because object reference is Phone doesn't contain this method.
    }
}
