class Student {
    String name;
    static String college = "SCE";

    Student(String name) {
        this.name = name;
    }

    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student.changeCollege("SNPSU");

        Student s1 = new Student("ABC");
        Student s2 = new Student("XYZ");

        s1.display();
        s2.display();
    }
}