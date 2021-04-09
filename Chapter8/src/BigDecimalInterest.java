import java.math.BigDecimal;
import java.text.NumberFormat;

public class BigDecimalInterest {
    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000000.00);
        BigDecimal rate = BigDecimal.valueOf(0.09);

        System.out.printf("%s %20s %n", "Year ", "Amount on deposit");
        for(int year = 1; year <= 10; year++){
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year) );
            System.out.printf("%5d %20s %n ", year, NumberFormat.getCurrencyInstance().format(amount));

        }
    }
}
