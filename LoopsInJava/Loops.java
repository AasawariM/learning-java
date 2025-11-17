public class Loops {

    public static void main(String[] args) {

        // while loop
        // while loop checks for the condition first then executes the statements or run
        // the block of code inside while
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello While Loop " + i);
            i++;
        }
        System.out.println("bye " + i);

        // Nested While Loop
        System.out.println("----------Nested While Loop---------------");
        int day = 1;
        while (day <= 7) {
            System.out.println("It's a Day Number " + day);
            int j = 1;
            while (j <= 1) {
                System.out.println("Good Morning!");
                System.out.println("Good Afternoon!");
                System.out.println("Good Evening! \n");
                j++;
            }
            day++;
        }

        // do-while loop
        // in do while loop the code is executed at least once even if the condition is
        // false i.e first runs the code then check the condition.

        int k = 5;
        do {
            System.out.println("Welcome Java " + k);
            k++;
        } while (k <= 5);

        //for loop
        //initialization ; condition ; increment/decrement
        for(int m = 1; m<=5; m++){
            System.out.println("For Loop "+m);
        }
        System.out.println();
        //in decrement order
        for(int m = 5; m>=1; m--){
            System.out.println("For Loop "+m);
        }
        //example printing day of week with working hours
        for(int l=1;l<=5;l++){
            System.out.println("Day "+l);
            for(int n=1;n<=9;n++){
                System.out.println(
                    "Hour: "+(n+8)+"-"+(n+9)
                );

            }
        }
        // In a for loop: first initialization, then condition check, then block execution, then increment/decrement.
    }
}