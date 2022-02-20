import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ScientificNotation {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        String numText = String.valueOf(num);
        String format;
        if (numText.startsWith("-")) {
            format = "%.4E";
        }
        else {
            format = "+%.4E";
        }
        String res = String.format(format, num);
        System.out.println(res);

//        if (num > 0) {
//            System.out.printf("+%.4E\n", num);
//        } else {
//            System.out.printf("%.4E\n", num);
//        }

        sc.close();
    }
}
