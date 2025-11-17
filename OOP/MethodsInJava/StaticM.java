// Static Method
// Belongs to the class and can be called using ClassName.methodName().

class Mul {
    public static int multiply(int a, int b) { // static method
        return a * b;
    }
}

public class StaticM {
    public static void main(String[] args) {
        int result = Mul.multiply(4, 5); // calling static method
        System.out.println(result);
    }
}
