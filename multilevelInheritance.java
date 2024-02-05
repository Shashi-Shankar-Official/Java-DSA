public class multilevelInheritance {

    public static void main(String[] args) {
        /*
         * Dog bulldog = new Dog();
         * bulldog.legs = 4;
         * System.out.println(bulldog.legs);
         */

        Deer d = new Deer();
        d.eat();
        d.number = 5;
        System.out.println(d.number);

        Animal d2 = new Deer();
        // d2.number = 5;

    }

}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats anythihing");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }

    int number;
}

class Mamal extends Animal {
    int legs;
}

class Dog extends Mamal {
    String breed;
}
