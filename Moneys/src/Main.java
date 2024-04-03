import Moneys.Money;

public class Main
{
    public static void main(String[] args)
    {
        Money money = new Money(100,23);
        Money money1 = new Money(500,90);
        System.out.println("результат суммы двух денежных средств");
        System.out.println(money1.add(money));
        System.out.println("результат разницы двух денежных средств");
        System.out.println(money1.subtract(money));
        System.out.println("результат деления на число");
        System.out.println(money1.divide(12));
        System.out.println("результат произведения на число");
        System.out.println(money1.multiply(3));
        System.out.println("метод toString");
        System.out.println(money.toString());

    }
}