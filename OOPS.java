public class OOPS {

    public static void main(String args[]) {

        Pen p1 = new Pen(); // created a pen object called p1
        p1.setcolor("Blue");
        System.out.println(p1.color);

        p1.settip(5);
        System.out.println(p1.tip);

        // p1.setcolor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "ShashiShankar";
        // myAcc.password = "abcdefgh"; this is not visible
        myAcc.setpassword("abcdefghijklmnopqrstuvwxyz");

    }

}

class BankAccount {
    public String username;
    private String password;

    public void setpassword(String pwd) {
        password = pwd;

    }

}

class Pen {
    // properties & functions
    String color;
    int tip;

    void setcolor(String newColor) {
        color = newColor;
    }

    void settip(int newTip) {
        tip = newTip;
    }

}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int che, int maths) {
        percentage = (phy + che + maths) / 3;
    }

}
