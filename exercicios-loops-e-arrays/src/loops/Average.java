package loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int num;
        double count = 0;
        int biggest = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            count += num;

            if (biggest < num) {
                biggest = num;
            }
        }

        double average = count / 5;
        System.out.println("Average = " + average);
        System.out.println("Biggest = " + biggest);
        sc.close();
    }
}
