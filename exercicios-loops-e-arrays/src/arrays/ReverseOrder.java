package arrays;

/*
Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
*/

public class ReverseOrder {
    public static void main(String[] args) {

        int[] vector =  new int[6];
        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 3;
        vector[3] = 4;
        vector[4] = 5;
        vector[5] = 6;

        for (int i = vector.length - 1; i >=0 ; i--) {
            System.out.println(vector[i]);
        }

    }
}
