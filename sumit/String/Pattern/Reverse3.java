package sumit.String.Pattern;

public class Reverse3 {
    public static void main(String[] args) {
        String str ="JAVA";
        String str1 ="";

        for (int i = str.length() - 1; i >= 0; i--){
            str1 = str + str.charAt(i);

        }
        System.out.println(str1);
    }
}
