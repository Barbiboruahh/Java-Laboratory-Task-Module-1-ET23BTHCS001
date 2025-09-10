class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos: Moo moo!");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();
    }
}

