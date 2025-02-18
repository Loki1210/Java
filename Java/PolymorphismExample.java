package Module0;
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {
    void sound() { // Overriding method
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    void sound() { // Overriding method
        System.out.println("Dog barks");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Cat();
        myAnimal.sound(); // Outputs "Cat meows"

        myAnimal = new Dog();
        myAnimal.sound(); // Outputs "Dog barks"
    }
}
