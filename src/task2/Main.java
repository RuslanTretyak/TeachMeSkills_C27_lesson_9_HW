package task2;


import task2.util.Utils;

public class Main {
    public static void main(String[] args) {
        int[][] array1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        int[][] array2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        Utils.printMatrix(array1);
        Utils.printMatrix(array2);
        Utils.printMatrix(Utils.multiplyMatrix(array1, array2));

    }
}
