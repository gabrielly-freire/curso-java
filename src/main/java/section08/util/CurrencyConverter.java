package section08.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double dollarsToBuy){
        dollarsToBuy *= dollarPrice;
        dollarsToBuy += dollarsToBuy * IOF;
        return dollarsToBuy;
    }

}
