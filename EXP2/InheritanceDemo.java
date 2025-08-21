// ---------- Single Inheritance ----------
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

// ---------- Multilevel Inheritance ----------
class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

// ---------- Main Class ----------
public class InheritanceDemo {
    public static void main(String[] args) {

        // Single Inheritance Example
        System.out.println("--- Single Inheritance Example ---");
        Car myCar = new Car();
        myCar.start();  
        myCar.drive();  

        // Multilevel Inheritance Example
        System.out.println("\n--- Multilevel Inheritance Example ---");
        Dog myDog = new Dog();
        myDog.eat();    
        myDog.walk();   
        myDog.bark();   
    }
}
