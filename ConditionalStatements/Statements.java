public class Statements {

    public static void main(String[] args) {
        int x = 100;
        // if statement

        if (x > 10)
            System.out.println("X is greater than 10");

        // if-else

        int age = 16;

        if (age >= 18)
            System.out.println("Adult");
        else
            System.out.println("Minor");

        // if–else-if Ladder

        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // Nested if
        // It is useful when a second condition depends on the first.
        int age1 = 20;
        boolean hasID = true;

        if (age1 >= 18) {
            if (hasID) {
                System.out.println("You can enter");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Underage");
        }

        // Switch Case
        int day = 4;
        switch (day) {
            case 1:
            System.out.println("Monday");
            break; //needed because:without break statement,once switch matches atleast one condition it executes all cases also 
            // i.e The break statements are necessary without the break keyword, statements in switch blocks fall through.  
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Sunday");
        }

        //enhanced version of switch
        String result = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.println(result);
        //The expression can be of type byte, short, int char,String
        // Duplicate case values are not allowed.
        // The break statement is used inside the switch to terminate a statement sequence.
        // The default statement is optional and doesnt have break statement.
    }
}