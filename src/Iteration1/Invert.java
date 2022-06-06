package Iteration1;

import java.math.BigDecimal;

public class Invert {
    public static void main(String[] argv) throws Exception {
        BigDecimal decimal = new BigDecimal("1234");
        System.out.println(reverseSign(decimal));
    }
    public static final BigDecimal MINUS_ONE = BigDecimal.valueOf(-1L);

    public static BigDecimal reverseSign(BigDecimal decimal) {
        return minus(decimal);
    }

    public static BigDecimal minus(BigDecimal decimal) {
        return decimal.multiply(MINUS_ONE);
    }
}

