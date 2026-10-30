
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat says meow");
    }
}

public class Ass10Q5 {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();

        Cat c = new Cat();

        c.eat();
        c.meow();
    }
}
