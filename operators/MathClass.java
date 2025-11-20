public class MathClass {

    public static void main(String[] args) {

        // round method
        Long a = Math.round(10.86);
        int b = Math.round(121.4F);
        System.out.println(a);
        System.out.println(b);

        // ceil method
        Double c = Math.ceil(10.02F);
        System.out.println(c);

        // floor method
        double d = Math.floor(23.9);
        System.out.println(d);

        // max method
        int result = Math.max(23, 101);
        System.out.println(result);

        // min method
        int result2 = Math.min(23, 101);
        System.out.println(result2);

        // random method
        double result3 = Math.random(); 
        // random number between 0 to 100
        result3 = Math.random() * 100;
        System.out.println(result3);

        // Math.round returns a long → storing in double shows .0
        double result3r = Math.round(result3);
        System.out.println(result3r);

        // cast to int to remove decimal
        int result4 = (int)Math.round(result3);
        System.out.println(result4);

        // alternative approach = correct use of () 
        int res = (int)(Math.round(result3));
        System.out.println(res);
    }
}
