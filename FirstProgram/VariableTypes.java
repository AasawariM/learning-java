public class VariableTypes {
    static String name; //static variable
    String grade;
    public static void main(String[] args) { 
        System.out.println(name); //static variable,result in null as reference type

        VariableTypes s = new VariableTypes(); // Create object to access instance variable
        System.out.println(s.grade); //instance variable,result in null as reference type
    }
}