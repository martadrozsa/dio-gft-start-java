import java.io.IOException;
import java.util.Scanner;

public class RightArea {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);

        double[][] M = {
                {155.4, 29.9, 157.7, 56.4, 81.9, 202.5, 217.0, 151.5, 154.0, 72.2, 193.1, 247.7},
                {133.4, 83.8, 192.5, 142.9, 240.1, 151.3, 230.0, 42.7, 155.8, 114.2, 134.6, 217.4},
                {235.4, 276.4, 113.0, 111.3, 105.7, 151.4, 85.7, 296.0, 77.1, 140.5, 242.4, 131.5},
                {274.6, 82.8, 67.8, 26.3, 113.4, 37.1, 291.4, 76.9, 291.1, 285.4, 289.1, 216.1},
                {254.6, 290.8, 134.1, 104.1, 21.5, 288.3, 237.9, 167.1, 182.9, 250.0, 259.8, 109.7},
                {110.0, 29.1, 278.1, 116.6, 202.0, 71.7, 219.3, 101.9, 275.3, 65.6, 127.9, 68.8},
                {279.6, 196.3, 27.8, 206.7, 156.7, 183.7, 85.8, 174.6, 12.9, 90.1, 221.5, 103.5},
                {74.5, 112.4, 136.8, 90.6, 220.0, 6.8, 242.0, 160.2, 48.5, 137.6, 251.3, 226.3},
                {39.1, 293.3, 295.3, 12.4, 289.6, 76.0, 160.4, 60.8, 286.3, 41.7, 209.4, 7.0},
                {158.1, 248.9, 269.9, 186.7, 204.6, 263.7, 288.0, 205.1, 153.1, 69.7, 47.5, 113.8},
                {6.2, 37.8, 233.8, 113.3, 178.0, 132.7, 193.7, 140.6, 88.7, 256.1, 89.0, 290.0},
                {295.8, 268.4, 283.0, 74.3, 178.1, 272.3, 16.2, 144.5, 67.6, 202.5, 134.1, 258.7}
        };

        int tamanhoMatriz = 12;
        int metadeMatriz = (tamanhoMatriz - 1) / 2;

//        for (int i = 0; i < 12; i++) {
//            for (int j = 0; j < 12; j++) {
//                M[i][j] = leitor.nextDouble();
//            }
//        }

        for (int x = 0; x < tamanhoMatriz; x++) {
            for (int y = 0; y < tamanhoMatriz; y++) {

                if (x < y && y > metadeMatriz) {
                    if (x <= metadeMatriz) {
                        if (x + y >= tamanhoMatriz) {
                            soma += M[x][y];
                        }
                    } else {
                        soma += M[x][y];
                    }
                }
            }
        }

        if (O == 'M') {
            soma /= 30;
        }

        System.out.println(String.format("%.1f", soma));

        leitor.close();


    }
}
