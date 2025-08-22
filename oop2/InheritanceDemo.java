import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Inheritance Demo ---");
        System.out.println("Choose an option:");
        System.out.println("1. Car (Single Inheritance)");
        System.out.println("2. Dog (Multilevel Inheritance)");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Car myCar = new Car();
                System.out.println("\n--- Car Actions ---");
                System.out.println("1. Start Car");
                System.out.println("2. Drive Car");
                System.out.print("Enter choice: ");
                int carChoice = sc.nextInt();

                if (carChoice == 1) {
                    myCar.start();
                } else if (carChoice == 2) {
                    myCar.drive();
                } else {
                    System.out.println("Invalid choice!");
                }
                break;

            case 2:
                Dog myDog = new Dog();
                System.out.println("\n--- Dog Actions ---");
                System.out.println("1. Eat");
                System.out.println("2. Walk");
                System.out.println("3. Bark");
                System.out.print("Enter choice: ");
                int dogChoice = sc.nextInt();

                if (dogChoice == 1) {
                    myDog.eat();
                } else if (dogChoice == 2) {
                    myDog.walk();
                } else if (dogChoice == 3) {
                    myDog.bark();
                } else {
                    System.out.println("Invalid choice!");
                }
                break;

            default:
                System.out.println("Invalid option!");
        }

        sc.close();
    }
}


