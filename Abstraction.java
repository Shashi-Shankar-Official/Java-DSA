public class Abstraction {

    public static void main(String args[]) {

        Horse H = new Horse();
        H.eat();
        H.walk();
        System.out.println(H.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal(); // we cannot create object of the type Animal.

        Mustang myhorse = new Mustang();
        // Animal-> Horse-> Mustang
    }

}

abstract class Animal {
    String color = "brown";

    Animal() {
        System.out.println("Animal constructor called");

    }

    void eat() {
        System.out.println("eat");

    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("Walks on four legs");
    }

}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("walks on two legs");
    }
}