package Exception;

public class ArrayOBE {
    public static void main(String[] args) {

        System.out.println("The is Program starting...! ");
        try {
            String s = args[5];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The program is executed.");
        }

        System.out.println("This program will be executed.");
    }
}
