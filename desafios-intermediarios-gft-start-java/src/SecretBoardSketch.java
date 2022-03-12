import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecretBoardSketch {

    public static void main(String[] args) throws IOException {
//        int[][] board = {
//                {0, 5, 3, 8, 5},
//                {3, 5, 8, 8, 2},
//                {0, 7, 8, 4, 7},
//                {7, 2, 5, 8, 2},
//                {3, 2, 3, 2, 5},
//        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the board size: ");
        //int n = sc.nextInt();


        System.out.print("Enter the number of operations: ");
        //int quantityOperations = sc.nextInt();

//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                board[i][j] = sc.nextInt();
//            }
//        }

        String valuesSizeQuantity = sc.nextLine();
        String[] result = valuesSizeQuantity.split(valuesSizeQuantity);

        int n = Integer.parseInt(result[0]);
        int q = Integer.parseInt(result[1]);

        int[][] board = new int[n][n];

        int i = 0;
        while (i < q) {
            String operations = sc.nextLine();
            String[] valuesOperations = operations.split(operations);

            int ope;
            int pos;
            int value = 0;

            if (valuesOperations.length == 3) {
                ope = Integer.parseInt(result[0]);
                pos = Integer.parseInt(result[1]);
                value = Integer.parseInt(result[2]);
            }
            else {
                ope = Integer.parseInt(result[0]);
                pos = Integer.parseInt(result[1]);
            }

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


//
//        System.out.println("Enter value X:");
//        int x = sc.nextInt();
//
//        System.out.println("Enter value R:");
//        int r = sc.nextInt();

//        assignValueRLineX(board, 3, 9);
//        assignValueRColumnX(board, 3, 1);

//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }

//        System.out.println(printFrequentValueColumnX(board, 1));
//        System.out.println(printFrequentValueLineX(board,4));


        sc.close();

    }

    public static void assignValueRLineX(int[][] board, int x, int r) {
        for (int i = 0; i < board.length; i++) {
            board[x][i] = r;
            //System.out.print(boardSize[x][i]);
        }
    }

    public static void assignValueRColumnX(int[][] board, int x, int r) {
        for (int j = 0; j < board.length; j++) {
            board[j][x] = r;
            //System.out.print(boardSize[j][x]);
        }
    }

    public static int printFrequentValueLineX(int[][] board, int x) {

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
        return biggestKey;
    }

    public static int printFrequentValueColumnX(int[][] board, int x) {
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
        return biggestKey;
    }

}
