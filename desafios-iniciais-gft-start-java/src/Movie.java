import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Movie {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double difference = B - A;
        double increase = (difference / A) * 100;

        System.out.printf("%.2f", increase);
        System.out.print("%\n");
    }
}