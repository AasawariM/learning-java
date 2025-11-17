// Class representing a student
class Student {
    // Properties (state) of the Student object
    int id;
    String name;

    // Constructor to initialize a Student object
    // This constructor takes two parameters and assigns them to the object's properties
    public Student(int stud_id, String stud_name) {
        this.id = stud_id;       // Assign the passed student ID to object's id
        this.name = stud_name;   // Assign the passed student name to object's name
    }
}

public class Constructor {
    public static void main(String[] args) {

        // Create a new Student object using the constructor
        Student s = new Student(1, "Alice"); //arguments passed
        // arguments are the actual values you provide when calling the constructor,
        //  while parameters are the variables defined in the constructor

        // Access and print the object's properties
        System.out.println(s.id);    // prints: 1
        System.out.println(s.name);  // prints: Alice
    }
}
