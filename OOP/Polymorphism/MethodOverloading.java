// Class demonstrating Method Overloading in Java
class CalculateSum {

    // Method 1: Two integer parameters
    public int sum(int a, int b) {
        return a + b;
    }

    // Method 2: Three integer parameters
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Mixed parameter types (float, int)
    public float sum(float a, int b) {
        return a + b;
    }

    // Method 4: Multiple mixed parameter types (double, int, double, int)
    public double sum(double a, int b, double c, int d) {
        return a + b + c + d;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        // Creating object
        CalculateSum c = new CalculateSum();

        // Calling overloaded methods
        System.out.println(c.sum(10, 20));
        System.out.println(c.sum(2, 3, 5));
        System.out.println(c.sum(2.4f, 5));
        System.out.println(c.sum(10.5, 5, 2.0, 10));
    }
}
