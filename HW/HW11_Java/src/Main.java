// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int[][] img =
                {
                        {1,1,1},
                        {1,1,0},
                        {1,0,1}
                };

//        System.out.println(img[1][0]);

        int sr = 1;
        int sc = 1;
        int nc = 2;

        Graph g = new Graph();
        int[][] output = g.floodFill(img, sr, sc, nc);

//        System.out.println(output[1][2]);
//        for(int i=0; i<output.length;i++){

//            for (int[] ints : output) {
//                for (int j = 0; j < output[0].length; j++) {
//                    System.out.print(ints[j] + " ");
//                }
//            System.out.println();
//        }

        for (int[] row : output) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

//        System.out.println(output[1][2]);



    }
}