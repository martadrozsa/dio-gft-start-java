import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecretBoard {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String valuesSizeQuantity = sc.nextLine();
        String[] result = valuesSizeQuantity.split(" ");

        int n = Integer.parseInt(result[0]);
        int q = Integer.parseInt(result[1]);

        int[][] board = new int[n][n];

        int i = 0;
        while (i < q) {
            String operations = sc.nextLine();
            String[] valuesOperations = operations.split(" ");

            int ope;
            int pos;
            int value = 0;

            if (valuesOperations.length == 3) {
                ope = Integer.parseInt(valuesOperations[0]);
                pos = Integer.parseInt(valuesOperations[1]);
                value = Integer.parseInt(valuesOperations[2]);
            }
            else {
                ope = Integer.parseInt(valuesOperations[0]);
                pos = Integer.parseInt(valuesOperations[1]);
            }
            pos--;

            switch (ope) {
                case 1:
                    assignValueRLineX(board, pos, value);
                    break;
                case 2:
                    assignValueRColumnX(board, pos, value);
                    break;
                case 3:
                    printFrequentValueLineX(board,pos);
                    break;
                case 4:
                    printFrequentValueColumnX(board, pos);
                    break;
            }
            i++;

        }
        sc.close();

    }

    public static void assignValueRLineX(int[][] board, int x, int r) {
        for (int i = 0; i < board.length; i++) {
            board[x][i] = r;
        }
    }

    public static void assignValueRColumnX(int[][] board, int x, int r) {
        for (int j = 0; j < board.length; j++) {
            board[j][x] = r;
        }
    }

    public static void printFrequentValueLineX(int[][] board, int x) {

        Map<Integer, Integer> frequencyLine = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            int key = board[x][i];

            if (frequencyLine.containsKey(key)) {
                int newValue = frequencyLine.get(key) + 1;
                frequencyLine.put(key, newValue);
            }
            else {
                frequencyLine.put(key, 1);
            }
        }
        int biggestKey = -1;
        int biggestFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyLine.entrySet()) {
            int key = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > biggestFrequency) {
                biggestKey = key;
                biggestFrequency = frequency;

            }else if (frequency == biggestFrequency && key > biggestKey) {
                biggestKey = key;
            }
        }
        System.out.println(biggestKey);
    }

    public static void printFrequentValueColumnX(int[][] board, int x) {
        Map<Integer, Integer> frequencyColumn = new HashMap<>();

        for (int[] ints : board) {
            int key = ints[x];

            if (frequencyColumn.containsKey(key)) {
                int newValue = frequencyColumn.get(key) + 1;
                frequencyColumn.put(key, newValue);
            } else {
                frequencyColumn.put(key, 1);
            }
        }

        int biggestKey = -1;
        int biggestFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyColumn.entrySet()) {
            int key = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > biggestFrequency) {
                biggestKey = key;
                biggestFrequency = frequency;

            }else if (frequency == biggestFrequency && key > biggestKey) {
                biggestKey = key;
            }
        }
        System.out.println(biggestKey);
    }
}
