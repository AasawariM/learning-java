public class Strings {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        // String literal
        String s1 = "Hello String1";
        System.out.println(s1); // Stored in String Pool

        // Using new keyword
        String s2 = new String("Hello String2");
        System.out.println(s2); // Creates new object in heap, not in String Pool.

        // String Immutability
        String s = "Welcome";
        s.concat(" World"); // returns new string, original not changed
        System.out.println(s); // Output: Welcome

        s = s.concat(" World");
        System.out.println(s); // Output: Welcome World

        // String Comparison
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(str1 == str2); // true (same reference in String Pool)
        System.out.println(str1 == str3); // false (different objects)
        System.out.println(str1.equals(str3)); // true (same content)

        int num = Integer.parseInt("123");
        System.out.println(num);

        String ab = String.valueOf(123);
        System.out.println(ab);

        float f = Float.parseFloat("12.5");
        System.out.println(f);

        char[] chars = { 'H', 'i' };
        String demo = new String(chars);
        System.out.println(demo);

        System.out.println("------------ String Methods ------------");
        String name = "Aasawari";
        String surname = "Mandhare";
        System.out.println(name);
        System.out.println(surname);

        System.out.println(name.length());
        System.out.println(name.indexOf("w"));

        System.out.println(name.indexOf("p"));
        
        System.out.println(name.replace("sa", "bha")); // here target and replacement are parameters and "sa" and "bha"
                                                       // are arguments (actual values).

        System.out.println(name.concat(surname));
        System.out.println(name.charAt(4));

        String country = "India";
        System.out.println(name.equals(country));
        System.out.println(country.toUpperCase());
        System.out.println(country.toLowerCase());

        System.out.println(country == "INDIA"); // This compares references, not content
        System.out.println(country.equalsIgnoreCase("INDIA")); //Compares actual text ignoring case

        String message = "  Good evening";
        System.out.println(message.endsWith("ing"));
        System.out.println(message.trim()); // remove extra whitespaces by trimming
        System.out.println(message); // original string
    }
}
