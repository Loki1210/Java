package Module0;



public class ControlStructuresExample {
    public static void main(String[] args) {
        int number = 0;

        if (number > 0) {
            System.out.println("Positive Number");
        } 
        else if(number==0)
        {
            System.out.println("Number is 0");
        }
        else {
            System.out.println("Negative Number");
        }

   
        for (int i = 5; i >= 1; i--) {
            System.out.println("Iteration: " + i);
        }
    }
}
