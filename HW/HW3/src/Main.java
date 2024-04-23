import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void insertionSort(int[] array){
        int n = array.length;
        for(int i = 1; i<n; i++){
            int key=array[i];
            int j=i-1;

            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
//                array[j+1] = key;
                j--;
            }
            array[j+1]=key;
        }

    }

    public static int[][] matrixMultiply(int[][] A, int[][] B) throws IllegalAccessException {
        if(A[0].length != B.length){
            throw new IllegalAccessException("Matrix multiplication is not defined.");
        }

        int row_A = A.length;
        int cols_A = A[0].length;
        int cols_B = B[0].length;
        int[][] result = new int[row_A][cols_B];

        for(int i=0; i<row_A;i++){
            for(int j=0; j<cols_B; j++){
                int sum = 0;
                for(int k=0; k<cols_A; k++){
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }


    public static void main(String[] args) throws IllegalAccessException {


//        int[] array = new int[8];
//        array = new int[]{1, 4, 5, 3, 2, 9, 4};

        int[] array = {1, 4, 5, 3, 2, 9, 6};

        System.out.println("Array without sorting ");
        for(int i = 0; i < array.length; i++){
            System.out.printf(array[i] + " ");
        }

        System.out.println(" ");
        insertionSort(array);
        System.out.println("Array with sorting ");

        for(int i = 0; i < array.length; i++){
            System.out.printf(array[i] + " ");
        }

        int[][] A = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] B = {{9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}};

        System.out.println(" ");
        int[][] output = matrixMultiply(A,B);
        System.out.println("Reuslt of matrix multiplication");
        for (int i = 0; i < A.length; ++i) {
            for (int j = 0; j < B[0].length; ++j) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }




    }
}