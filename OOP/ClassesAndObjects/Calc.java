// This class demonstrates a simple class with properties and a method
// Classes can have properties (variables) and methods (functions)
class Demo { 

    // Properties (state) of the object
    int x;
    int y;

    // Method 'calculate' takes two integers as input and returns their sum
    // It also updates the object's properties x and y
    
    public int calculate(int a, int b) {
        x = a; // store first input in object's property x
        y = b; // store second input in object's property y
        int result = a + b; //sum of a and b
        System.out.println("Calculated"); 
        return result;
    }
}

public class Calc {

    public static void main(String[] args) {
        
        // Create an object of the Demo class
        Demo d = new Demo(); 
        
        // Call the calculate method on object 'd' with arguments 2 and 3
        // The object's state (x and y) is updated
        int answer = d.calculate(2, 3); 
        
        // Print the result returned by the calculate method
        System.out.println(answer);
        
        // Accessing object's properties to see stored state
        System.out.println("Object state: x = " + d.x + ", y = " + d.y);
    }
}
