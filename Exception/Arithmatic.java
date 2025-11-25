package Exception;

public class Arithmatic {
    public static void main(String[] args) {

        System.out.println("The is starting point...! ");
        try {
            int a = 100 / 0;
        }
        catch (ArithmeticException e){
            System.out.println("This is program is ending");
        }

        System.out.println("This is starting to executed. ");

    }
}
