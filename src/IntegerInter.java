public class IntegerInter implements NumberInter {
    @Override
    public void add(double a, double b) {
        System.out.println(a + b );
    }

    @Override
    public void minus(double a, double b) {
        System.out.println( a - b);
    }

    @Override
    public void multiplication(double a, double b) {
        System.out.println( a * b);
    }

    @Override
    public void division(double a, double b) {
        System.out.println(a / b);
    }
}