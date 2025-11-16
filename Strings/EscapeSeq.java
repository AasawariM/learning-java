public class EscapeSeq {
    public static void main(String[] args) {
        String message = "Hello, Steve Harrington";
        System.out.println(message);
        // Double quote
        String message1 = "Hello, \"Steve Harrington\"";
        System.out.println(message1);

        // Backslash
        String path = "C:\\learning-java\\Strings.java";
        System.out.println(path);

        //New line
        String message2 = "Hello\nWorld!";
        System.out.println(message2);

        //Tab space
        String message3 = "Name:\tSteve";
        System.out.println(message3);

    }
}
