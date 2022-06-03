import java.text.DecimalFormat;

public class Rounded {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        double input = 12.5555;

        System.out.println(input);
        System.out.println( df.format(input));
    }
}
