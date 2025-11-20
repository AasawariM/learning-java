public class NumberFormat {
    public static void main(String[] args) {

        // we cannot create instance of number format (new keyword) class in java
        // because its abstract
        // instead we use a factory method called getCurrencyInstance which creates new objects
        java.text.NumberFormat currency = java.text.NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        java.text.NumberFormat percent = java.text.NumberFormat.getPercentInstance();
        String result1 = percent.format(8.23);
        System.out.println(result1);

        // instead of writing it in separate variable and printing,
        // we can use method chaining
        String res = java.text.NumberFormat.getCurrencyInstance().format(323455345);
        System.out.println(res);
    }
}
