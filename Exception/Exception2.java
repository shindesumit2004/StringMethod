package Exception;

public class Exception2 {
    public static void main(String[] args) {
        System.out.println("Program is Started !");
        try {
            int a = 100/0;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println("The is show the Arithematic exception.");
        }
        catch (Exception f){
            System.out.println("This is exception block.");
        }
    }
}
