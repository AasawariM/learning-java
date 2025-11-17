class Student {
    static String collegeName = "ABC College"; // static variable
    String studentName; // instance variable

    public Student(String name){
        studentName = name;
    }
    public void Display(){
        System.out.println("Name: "+studentName);
        System.out.println("College Name: "+collegeName);
    }
}

public class StaticV {
    public static void main(String[] args) {
        Student.collegeName = "M. L. Dahanukar College";
        System.out.println("Updated College Name: "+Student.collegeName);

        Student s1 = new Student("Aasawari");
        Student s2 = new Student("Shrutika");
        s1.Display();
        s2.Display();
    }
}
