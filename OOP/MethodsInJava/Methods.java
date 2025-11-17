// Parameters are variables passed into a method.
// Arguments are actual values passed when calling the method.

class Greetings {

    // Simple user-defined method
    // Void method = doesn’t return anything
    public void greet() {
        System.out.println("Methods in Java!");
    }

    // Non-void method = returns a value
    public int square(int n) { // 'n' is parameter
        return n * n;
    }
}

public class Methods {
    public static void main(String[] args) {
        Greetings g = new Greetings();
        g.greet();
        int result = g.square(10); // 10 is argument
        System.out.println(result);
    }
}
