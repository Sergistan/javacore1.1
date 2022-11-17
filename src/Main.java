public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); // ArithmeticException, т.к. на переменая b=0, а на ноль делить нельзя!
        boolean x = calc.isPositive.test(a);
        int z = calc.pow.apply(a);


        calc.println.accept(c);
        calc.printlnBool.accept(x);
        calc.println.accept(z);

    }
}
