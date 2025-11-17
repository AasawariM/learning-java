// Instance Methods
// Belong to an object and can access instance variables.

class Calculator {
    public int add(int a, int b) { // instance method
        return a + b;
    }

    String n = ""; //instance variable

    // Instance method 
    public void test(String n) { 
      this.n = n; 
    }
}

public class InstanceM {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result = c.add(10, 30);  // calling instance method
        System.out.println("Addition is: " + result);

        c.test("Instance methods"); //calling instance method
        System.out.println(c.n);
    }
}
