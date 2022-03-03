package arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Consonant {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char[] vector = new char[6];


        int count = 0;
        String consonant = "";

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Enter a letter: ");
            vector[i] = sc.next().charAt(0);

            if (vector[i] == 'a' || vector[i] == 'e' || vector[i] == 'i' || vector[i] == 'o' || vector[i] == 'u') {
                continue;
            }
            count += 1;
            consonant = consonant + " " + vector[i];

        }


        System.out.println(count);

        System.out.println("Consonants:" + consonant);
        sc.close();
    }
}