package Exception;

public class Exception3 {
    public static void main(String[] args) {

        System.out.println("The program is starting...");
        try {
            Integer I = new Integer("ABC");
        }
        catch(ArithmeticException e){
            System.out.println("This is needed to execute.");
           // e.printStackTrace();
        }
        catch (Exception a){
            System.out.println("This is not needed to execute.");
        }

        System.out.println("The statement will be executed.");

    }
}
