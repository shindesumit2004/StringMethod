package Exception;

public class Arithematic {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;


        System.out.println("Program Execution will start");
        try {
            int c = a / b;
            System.out.println("The execution of c is : "+ c);
        }
        catch (ArithmeticException v){
            System.out.println("Catched by using catch blocked");
        }
        System.out.println("The output of this program is : " );

        System.out.println("Program executed successfully");
    }
}
