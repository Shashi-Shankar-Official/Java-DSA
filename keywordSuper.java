public class keywordSuper {

    public static void main(String args[]) {
        Horse h1 = new Horse();
        System.out.println(h1.color);

    }

}

class Animal {
    String color;

    Animal() {
        System.out.println("animal constructor is clalled");
    }
}

class Horse extends Animal {
    Horse() {
        super();
        super.color = "brown";
        System.out.println("horse constructor is called");
    }
}
