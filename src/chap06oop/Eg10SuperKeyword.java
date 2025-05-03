package chap06oop;

class Vehicle {
    int maxSpeed = 120;
}

class Car extends Vehicle {
    int maxSpeed = 180;
    int maxSpeedOfVehicle = super.maxSpeed;
}

public class Eg10SuperKeyword {
    public static void main(String[] args) {
        // Instantiation of the object of class Car
        Car car = new Car();

        System.out.println("The max speed of car is " + car.maxSpeed);
        System.out.println("The max speed of vehicle is " + car.maxSpeedOfVehicle);
    }
}
