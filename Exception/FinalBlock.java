package Exception;

public class FinalBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int data = 10/0;
            System.out.println("Result: " + data);
        }
        catch (ArithmeticException ae){
            System.out.println("Exception caught: "+ ae);
        }
        finally {
            System.out.println("Finally block always executes");
        }
        System.out.println("Rest of the code");
    }
}
