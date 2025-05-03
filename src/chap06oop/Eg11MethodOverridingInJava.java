package chap06oop;

class LivingBeing{
    void eatFood() {
        System.out.println("Eat food to survive.");
    }
}

class Carnivorous {
    void eatFood() {
        System.out.println("Eat flesh to survive.");
    }
}

public class Eg11MethodOverridingInJava {
    public static void main(String[] args) {
        Carnivorous animal = new Carnivorous();
        animal.eatFood();
        // Display --> Eat flesh to survive.
    }
}
