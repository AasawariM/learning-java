class Demo {
    int a;      // instance variable
    String s;   // instance variable

    public int Sq(int num) { // 'num' is a local variable
        a = num;            // assigning value to instance variable inside method
        return a * a;       // returns square
    }
}

public class InstanceV {
    public static void main(String[] args) {
        Demo d = new Demo();  // object creation

        d.s = "Alice";        // assigning instance variable

        int result = d.Sq(4);

        System.out.println(result); // prints square
        System.out.println(d.s);    // prints instance variable value
    }
}
