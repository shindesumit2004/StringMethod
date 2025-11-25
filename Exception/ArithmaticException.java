package Exception;

public class ArithmaticException{
    public static void main(String[] args) {
        System.out.println("The program starting to execute...");
        try {
            int i = 1000 / 0;
        }
        catch (ArithmeticException a){
            System.out.println("catch block is executed");
        }

        //System.out.println("The output of this program is : " + i);

        System.out.println("The program is executed.");
    }
}
