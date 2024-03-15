/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

java
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound...");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Upcasting
        Animal cat = new Cat(); // Upcasting

        dog.makeSound(); // Calls Dog's makeSound() method
        cat.makeSound(); // Calls Cat's makeSound() method
    }
}

  
