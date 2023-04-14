import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        int a, b;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextInt();
            b = scan.nextInt();
        }

        Calculator adderObject = new Adders();
        System.out.println("The sum is: " + adderObject.add(a, b));
    }
}
abstract class Calculator{
    abstract int add(int a, int b);
}

class Adders extends Calculator{

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

