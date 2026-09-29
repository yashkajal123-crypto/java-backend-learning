// Polymorphism in Java - Compile-time and Runtime examples
// ai used to create this code just as an reference to study *** 
// Base class
class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
    
    public void move() {
        System.out.println("Animal is moving");
    }
}

// Derived classes
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof! Woof!");
    }
    
    @Override
    public void move() {
        System.out.println("Dog is running");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow! Meow!");
    }
    
    @Override
    public void move() {
        System.out.println("Cat is walking");
    }
}

class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Chirp! Chirp!");
    }
    
    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}

// Method Overloading - Compile-time Polymorphism
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class
public class POLYMORPHISM {
    public static void main(String[] args) {
        // Runtime Polymorphism - Method Overriding
        System.out.println("===== Runtime Polymorphism (Method Overriding) =====");
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Bird();
        
        animal1.sound();  // Calls Dog's sound()
        animal1.move();   // Calls Dog's move()
        
        animal2.sound();  // Calls Cat's sound()
        animal2.move();   // Calls Cat's move()
        
        animal3.sound();  // Calls Bird's sound()
        animal3.move();   // Calls Bird's move()
        
        // Using array of Animal
        System.out.println("\n===== Using Array of Base Class =====");
        Animal[] animals = {new Dog(), new Cat(), new Bird()};
        for (Animal animal : animals) {
            animal.sound();
            animal.move();
        }
        
        // Compile-time Polymorphism - Method Overloading
        System.out.println("\n===== Compile-time Polymorphism (Method Overloading) =====");
        Calculator calc = new Calculator();
        System.out.println("add(5, 10) = " + calc.add(5, 10));
        System.out.println("add(5.5, 10.5) = " + calc.add(5.5, 10.5));
        System.out.println("add(5, 10, 15) = " + calc.add(5, 10, 15));
    }
}
