package task2.util;

public class Utils {
    public static void printMatrix(int[][] array) {
        for (int[] tempArray : array) {
            for (int element : tempArray) {
                System.out.print(element + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[][] multiplyMatrix(int[][] array1, int[][] array2) {
        int[][] resultArray = new int[array1.length][array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                int element = 0;
                for (int k = 0; k < array1[0].length; k++) {
                    element += array1[i][k]*array2[k][j];
                }
                resultArray[i][j] = element;
            }
        }
        return  resultArray;
    }
}
