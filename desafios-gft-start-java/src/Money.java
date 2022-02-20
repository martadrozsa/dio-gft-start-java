import java.util.Locale;
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        int resto = (int) (N * 100.0 + 0.5);

        System.out.println("NOTAS:");

        int trocoNota100 = calculaNota(100, resto);
        int trocoNota50 = calculaNota(50, trocoNota100);
        int trocoNota20 = calculaNota(20, trocoNota50);
        int trocoNota10 = calculaNota(10, trocoNota20);
        int trocoNota5 = calculaNota(5, trocoNota10);
        int trocoNota2 = calculaNota(2, trocoNota5);

        System.out.println("MOEDAS:");

        double trocoMoeda100 = calculaMoeda(100, trocoNota2);
        double trocoMoeda50 = calculaMoeda(50, trocoMoeda100);
        double trocoMoeda25 = calculaMoeda(25, trocoMoeda50);
        double trocoMoeda10 = calculaMoeda(10, trocoMoeda25);
        double trocoMoeda5 = calculaMoeda(5, trocoMoeda10);
        calculaMoeda(1, trocoMoeda5);

        sc.close();
    }

    public static int calculaNota(int nota, int resto) {
        int quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        return resto % (nota * 100);
    }

    public static double calculaMoeda(double moeda, double resto) {
        int quociente = (int)(resto / moeda);
        System.out.printf("%d moeda(s) de R$ %.2f\n", quociente, moeda / 100);
        return resto % moeda;
    }
}

