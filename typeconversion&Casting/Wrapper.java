public class Wrapper {
    public static void main(String[] args) {

        // WRAPPER CLASSES = Object representation of primitive data types
        String a = "15";
        int A = Integer.parseInt(a) * 2;
        System.out.println(A);

        // Primitive data type
        int b;
        // Integer wrapper class
        Integer c;
        // assigning value to primitive
        b = 357;
        // auto-boxing (primitive → object)
        c = b;

        System.out.println("The primitive int b is: " + b);
        System.out.println("The Integer object c is: " + c);

        // Auto-unboxing = object → primitive
        Boolean d = true;
        boolean e = d;
        System.out.println(d);
        System.out.println(e);

        // Primitive types cannot use getClass();
        // autobox or use TYPE.class
        System.out.println(d.getClass().getSimpleName());

        // wrapper methods

        // primitive → String
        String s = Integer.toString(25);
        System.out.println(s);
        System.out.println(s.getClass().getSimpleName()); 

        // String → primitive
        int res = Integer.parseInt("80");
        System.out.println(res);

        double res1 = Double.parseDouble("1.3");
        System.out.println(res1);

        boolean res2 = Boolean.parseBoolean("true");
        System.out.println(res2);

        // Convert primitive → wrapper object
        Integer obj = Integer.valueOf(32); 
        System.out.println(obj);
        System.out.println(obj.getClass().getSimpleName());

        // wrapper → primitive
        int x = obj.intValue();
        System.out.println(x);

        // auto-unboxing using valueOf
        String ss = "25";
        int x1 = Integer.valueOf(ss);  // valueOf returns Integer → auto-unboxed to int
        System.out.println(x1);
    }
}
