package loops;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("\nMultiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            int result = i * n;
            System.out.println(n + " x " + i + " = " + result);

        }

        sc.close();
    }
}
