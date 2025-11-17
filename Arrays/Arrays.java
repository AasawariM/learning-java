public class Arrays {

    public static void main(String[] args) {

        // Array creation using direct initialization
        // type[] arrayName = {values}
        int arr1[] = { 1, 3, 5, 6 };

        System.out.println("Length of the array is: " + arr1.length);
        System.out.println("Element at index 3: " + arr1[3]); // fetch element at index 3

        // Updating an element in the array
        arr1[0] = 10;
        System.out.println("Updated element at index 0 is: " + arr1[0]);
        // Note: You cannot change the size of an array, but you can modify its values.

        // Printing all elements of arr1
        System.out.println("\nArray Elements:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // Creating a dynamic array (size fixed, values assigned later)
        System.out.println("-----------Dynamic Array--------------");

        int[] arr2 = new int[4]; // size is 4
        // Default values are: 0 for int, false for boolean, null for reference types
        System.out.println(arr2[3]); // prints 0

        // Assigning values
        arr2[0] = 5;
        arr2[1] = 10;
        arr2[2] = 15;
        arr2[3] = 20;

        System.out.println("Array Elements:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println();

        // Declaring and initializing using 'new'
        int[] arr3 = new int[] { 1, 2, 4, 5, 6 };

        for (int i = 0; i < arr3.length; i++) {
            System.out.println("Element at index " + i + " is " + arr3[i]);
        }

        // multidimensional arrays = array of arrays (in Java)
        int nums[][] = new int[3][4];
        // will use nested loop to print it.

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
            // this prints a 2 dimensional array with all zero values
        }

        System.out.println("--------------------assigning random elements to array------------------------");
        // to assign random values to above nums array
        // we use Math.random()
        int min = 1;
        int max = 10;
        for (int k = 0; k < nums.length; k++) {
            for (int j = 0; j < nums[k].length; j++) {
                nums[k][j] = (int) (Math.random() * (max - min + 1)) + min;
            }
        }

        // here instead of 3 and 4 will write nums.length and nums[i].length

        // printing array nums with random elements
        for (int k = 0; k < nums.length; k++) {
            for (int j = 0; j < nums[k].length; j++) {
                System.out.print(nums[k][j] + " ");
            }
            System.out.println();
        }



        // instead of using normal for loop for printing array we can use enhanced for loop

        System.out.println("-------------Enhanced for Loop---------------");

        for (int row[] : nums) // here n is not a simple variable it is an one dimensional array
        {
            for(int value: row){
                System.out.print(value+" ");
            }
            System.out.println();

        }

    }
}