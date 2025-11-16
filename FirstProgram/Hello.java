import java.awt.*;

class Hello {

    public static void main(String[] args) {

        int a = 21;
        int b = a;
        a = 32;
        System.out.println(a);
        System.out.println(b);

        Point point1 = new Point(3, 2);
        System.out.println(point1);
        Point point2 = point1;
        point1.x = 21;
        System.out.println(point2);
    }
}