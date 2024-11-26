package exercicio1.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public double price;
    public double quantity;

    public static double converter(double price, double quantity) {
        return (price * quantity) * (1 + IOF);
    }
}
