package sumit.String.Pattern;

public class ReversePryramid {
    public static void main(String[] args) {

        String str = "Java Programming";
        for (int i = str.length(); i >= 0; i--){
            System.out.println(str.substring(0,i));
        }
    }
}
