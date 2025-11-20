import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in); // Scanner reads input from terminal / keyboard / file etc.
     System.out.print("Enter Name: ");
     String str = s.nextLine(); //for reading a line next() and nextLine()
     
    //  String str1 = s.next();
     System.out.println("Your name is "+ str.trim()); // trim() removes extra spaces before and after the text
    //  System.out.println("Your name is "+ str1); 

    
     //Words in input are called "tokens"
    //  next() reads one token  
    // nextLine() returns all tokens no matter how many spaces or tabs are there
    s.close(); // good practice to close Scanner
}
}
