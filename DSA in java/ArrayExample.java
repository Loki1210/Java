public class ArrayExample {
    public static void main(String[] args) {

        int[] num1Array=new int[5];
        // 1. Declaration and Initialization (both at once)
        int[] numbers = {12, 4, 5, 2, 5}; // An integer array with initial values

        // 2. Accessing elements
        System.out.println("First Element: " + numbers[0]); // Access the element at index 0
        System.out.println("Second Element: " + numbers[1]); // Access the element at index 1

        // 3. Changing an element
        numbers[1] = 10; // Change the value of the element at index 1
        System.out.println("Modified Second Element: " + numbers[1]); // Print the modified element

        // 4. Array length
        int arrayLength = numbers.length; // Get the length of the array
        System.out.println("Array Length: " + arrayLength); // Print the length

        // 5. Looping through the array using a for loop
        System.out.println("Using for Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]); // Print each element with its index
        }

        // 6. Looping through the array using a for-each loop
        System.out.println("Using for-each Loop:");
        for (int number : numbers) {
            System.out.println(number); // Print each element
        }

        // 7. Multidimensional array
        int[][] multiArray = {{11, 22, 33}, {44, 55, 66}}; // A 2D array
        System.out.println("Element at row 0, column 0: " + multiArray[0][0]); // Accessing an element in 2D array

        // 8. Declaration, instantiation, and initialization separately
        String[] names = new String[3]; // Declaration and instantiation
        names[0] = "Chaitanya"; // Initialization
        names[1] = "Ajeet";   // Initialization
        names[2] = "Rahul";   // Initialization

        System.out.println("Name at index 0: " + names[0]); // Print the element

    }
}
