package Module0;
public class ExceptionHandlingExample {
    public static void main(String[] args) {


        try {
            int result = 10 / 0; // This will throw an exception
        }
        
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } 
        
        
        finally {
            System.out.println("Execution completed.");
        }
    }
}
