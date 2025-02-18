public class StringBuilderExample {

    public static void main(String[] args) {
        // 1. Creating a StringBuilder
        StringBuilder sb = new StringBuilder("Hello"); //Initializes with String "Hello"
        System.out.println("StringBuilder: " + sb); // Prints StringBuilder object

        // 2. Appending to a StringBuilder
        sb.append(" World"); // Append " World"
        System.out.println("After Append: " + sb); // Prints StringBuilder object

        // 3. Inserting into a StringBuilder
        sb.insert(5, ","); // Insert "," at index 5
        System.out.println("After Insert: " + sb); // Prints StringBuilder object

        // 4. Replacing characters in a StringBuilder
        sb.replace(6, 11, "Java"); // Replace characters from index 6 to 10 with "Java"
        System.out.println("After Replace: " + sb); // Prints StringBuilder object

        // 5. Deleting characters from a StringBuilder
        sb.delete(5, 6); // Delete character from index 5 to 5
        System.out.println("After Delete: " + sb); // Prints StringBuilder object

        // 6. Getting the length of a StringBuilder
        int length = sb.length(); // Uses length() method of StringBuilder class
        System.out.println("Length: " + length); // Prints StringBuilder object

        // 7. Accessing a character at a specific index
        char charAtIndex = sb.charAt(0); // Uses charAt() method of StringBuilder class
        System.out.println("Character at index 0: " + charAtIndex); // Prints StringBuilder object

        // 8. Converting StringBuilder to String
        String finalString = sb.toString(); // Uses toString() method of StringBuilder class
        System.out.println("Final String: " + finalString); // Prints StringBuilder object

        // 9. Reverse a string
        sb.reverse();
        System.out.println("Reversed String: "+ sb);
    }
}
