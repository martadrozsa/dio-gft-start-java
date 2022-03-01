package loops;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the name: ");
            String name = sc.nextLine();
            if (name.equals("0")) {
                break;
            }

            System.out.print("Enter the age: ");
            int age = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
    }
}
