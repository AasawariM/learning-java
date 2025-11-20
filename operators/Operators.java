public class Operators {
    public static void main(String[] args) {

        // arithmetic operators
        System.out.println("-------arithmetic operators-----------------");
        int a = 10;
        int b = 4;
        int result = a + b;
        int result1 = a - b;
        int result2 = a * b;
        int result3 = a / b; //dividing whole number by whole number will result in whole number not actual quotient
        // to get that we need to do type casting
        double result3a = (double) a/b;
        int result4 = a % b;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result3a);
        System.out.println(result4);

        // Unary Operators
        System.out.println("-------Unary operators (Operate on one operand.)-----------------");
        int c = 5;
        System.out.println(c++); // prints 5 as incremented later
        System.out.println(c); // 6 after increment
        System.out.println(c--); // prints 6 only
        System.out.println(c); // decrement will print 5

        System.out.println(++c); // 5 will get first incremented then prints 6
        System.out.println(--c); // 6 will get first decremented then prints 5

        System.out.println("value of c is " + c);
        // int answer = c++; //fetch/assign value first then increment called
        // post-increment
        int answer = ++c; // first increment then fetch and assign the value called pre-increment
        System.out.println(answer);

        // unary +
        int e = +10;
        System.out.println(e); // 10

        // unary -
        int x = 5;
        int y = -x;
        System.out.println(y); // -5

        // Logical NOT (!)
        boolean flag = true;
        System.out.println(!flag); // false

        // Assignment Operators
        System.out.println("-------Assignment operators (Used to assign values.)-----------------");
        int d = 9;
        System.out.println(d);
        d += 2;
        System.out.println(d);
        d -= 5;
        System.out.println(d);
        d *= 10;
        System.out.println(d);
        d /= 10;
        System.out.println(d);
        d %= 5;
        System.out.println(d);

        // Relational (Comparison) Operators
        System.out.println("-------Relational (Comparison) Operators (returns true/false.)-----------------");
        int num1 = 10;
        int num2 = 5;
        System.out.println(num1);
        System.out.println(num2);

        System.out.println(num1 == num2);

        System.out.println(num1 >= num2);

        System.out.println(num1 <= num2);
        num2 = 10;
        System.out.println(num1 != num2);
        num1 = 2;
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);

        // Logical Operators
        System.out.println("-------Logical Operators (returns combined true/false.)-----------------");

        boolean condition1 = true, condition2 = false;
        System.out.println(condition1 && condition2); // false
        System.out.println(condition1 || condition2); // true
        System.out.println(!condition1); // false

        System.out.println("-----with expressions-----");
        int p = 10;
        int q = 5;
        double r = 10.3;
        double s = 3.3;

        System.out.println((p > q) && (r > s)); // both true = true

        System.out.println((p > q) || (r < s)); // at least one true = true

        boolean ans = p > q;
        System.out.println(!ans);

        // Bitwise Operators
        // Ternary Operator
    }
}
