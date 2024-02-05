public class Inheritance {

    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
    }

}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// derived class
class fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims  in water");

    }
}
