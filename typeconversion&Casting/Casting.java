public class Casting {
    public static void main(String[] args) {
        byte a = 127; // small
        System.out.println(a);
        int b = 260; // big
        System.out.println(b);

        a = (byte) b; // putting big in small , here 260 will get % (modulus) by byte range 256 i.e
                      // 260 % 256 = 4 (remainder)
        System.out.println(a);

        float f = 25.5f;
        int c = (int) f; //type casting from float to int
        System.out.println(f);
        System.out.println(c);

        // implicit coversion (automatic conversion)
        byte num = 126;
        int num1 = num;
        System.out.println(num1);
        num1 = 239;
        // casting is explicit conversion
        num = (byte) num1; // 239 % 256 = -17
        System.out.println(num);
        
        //type promotion
        byte number1 = 10;
        byte number2 = 30;
        int result = number1 * number2;

        System.out.println(result);
    }
}