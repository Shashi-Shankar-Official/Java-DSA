public class GettersandSetters {

    public static void main(String args[]) {

        Pen p1 = new Pen(); // created a pen object called p1
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());

        p1.settip(5);
        System.out.println(p1.getTip());

        // p1.setcolor("Yellow");
        p1.setcolor("Yellow");
        System.out.println(p1.getcolor());

    }

}

class Pen {
    // properties & functions
    private String color;
    private int tip;

    String getcolor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setcolor(String newColor) {
        color = newColor;
    }

    void settip(int Tip) {
        this.tip = Tip;
    }

}
