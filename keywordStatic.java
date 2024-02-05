public class keywordStatic {

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "MGBPS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s1.returnPercentage(34, 34, 54));
        System.out.println(s2.returnPercentage(65, 89, 93));
    }

}

class Student {
    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;

    }

    String getname() {
        return this.name;
    }
}
