package loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);

        sc.close();
    }
}
