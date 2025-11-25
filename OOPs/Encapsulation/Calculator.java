package OOPs.Encapsulation;

class calculator1{

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        calculator1 cal = new calculator1();

        System.out.println("Add 2 int : " + cal.add(23,24));
        System.out.println("Add 3 int : " + cal.add(21, 22, 24));
        System.out.println("Add 2 double : " + cal.add(2.3,22.5));

    }
}
