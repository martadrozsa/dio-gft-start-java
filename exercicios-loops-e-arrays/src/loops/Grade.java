package loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        int grade = sc.nextInt();

        while (grade < 0 || grade > 10) {
            System.out.println("Invalid grade! Enter a grade: ");
            grade = sc.nextInt();
        }

        sc.close();
    }
}
