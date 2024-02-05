public class Constructors {

    public static void main(String args[]) {
        Student s2 = new Student("Shashi");
        System.out.println(s2.name);
        Student s1 = new Student();
        Student s3 = new Student(254);
        System.out.println(s3);
    }
}

class Student {
    String name;
    int roll;

    Student(String name) { // parametrized constructor
        this.name = name;

    }

    Student() { // non parametrized constructor
        System.out.println("Constructor is called....");
    }

    Student(int roll) {
        this.roll = roll;
    }
}
