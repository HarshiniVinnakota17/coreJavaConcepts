package Practice;

import java.util.Arrays;

public class twoDimensionalArray {

        public static void findMax(int[][] arr) {
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] > temp) {
                        temp = arr[i][j];
                    }
                }
            }
            System.out.println(temp);
        }
    public static void twoDArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
//           System.out.println("1D Array: " + Arrays.toString(arr[i]));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr[0][0] = 10;
        arr[0][1] = 45;
        arr[0][2] = 34;
        arr[0][3] = 24;
        arr[0][4] = 20;

        arr[1][0] = 33;
        arr[1][1] = 64;
        arr[1][2] = 96;
        arr[1][3] = 38;
        arr[1][4] = 89;

        arr[2][0] = 11;
        arr[2][1] = 12;
        arr[2][2] = 16;
        arr[2][3] = 18;
        arr[2][4] = 19;

        arr[3][0] = 21;
        arr[3][1] = 22;
        arr[3][2] = 36;
        arr[3][3] = 28;
        arr[3][4] = 29;

        arr[4][0] = 41;
        arr[4][1] = 42;
        arr[4][2] = 66;
        arr[4][3] = 78;
        arr[4][4] = 49;

        findMax(arr);
        twoDArray(arr);
    }
}
