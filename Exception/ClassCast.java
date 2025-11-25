package Exception;

public class ClassCast {
    public static void main(String[] args) {
        System.out.println("The program is starting to executed...!");
        try {
            Object o = new Object();
            ClassCast c = (ClassCast) o;
        }
        catch (Exception e){
            System.out.println("This program will executed.");
        }

        System.out.println("This statement will be executed.");
        System.out.println("End of the program.");


    }
}
