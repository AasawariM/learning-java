
class Sub {
    public int cal(int m,int n){ //here m and n are local varibles
        return m-n;
    }
    public void greet(){
        String msg = "Welcome to Java!"; // msg , a local variable
        System.out.println(msg);
    }
}

public class LocalV {

    public static void main(String[] args) {
     Sub b = new Sub();
     System.out.println(b.cal(5, 10));  
     b.greet();
    }
}