import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer integer = new Integer();
        Real real = new Real();

        System.out.println("Input a and b:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        integer.add((int)a, (int)b);
        real.multiplication(a, b);

        System.out.println("\n");

        System.out.println("Input a and b:");
        double a1 = scan.nextDouble();
        double b1 = scan.nextDouble();

        IntegerInter integer1 = new IntegerInter();
        RealInter real1 = new RealInter();

        integer1.division((int)a1, (int)b1);
        real1.minus(a1, b1);

    }
}