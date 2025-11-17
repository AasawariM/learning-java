class Employee {
    int id;       // instance variable
    String name;  // instance variable

    static String company = "XYZ TechCorp"; // static variable

    public void empDetails(int EmpId, String EmpName) {
        id = EmpId;
        name = EmpName;

        int bonus = 5000; // local variable

        System.out.println("ID: " + id + ", Name: " + name 
            + ", Company: " + company 
            + ", Bonus Received: " + bonus);
    }
}

public class Variables {
    public static void main(String[] args) {

        Employee e = new Employee();

        // Accessing static variable using class name
        System.out.println("Company Name: " + Employee.company);

        // Updating static variable
        Employee.company = "AgriTech";

        System.out.println("Updated Company Name: " + Employee.company);

        // Instance method call
        e.empDetails(1, "Bob");
    }
}
