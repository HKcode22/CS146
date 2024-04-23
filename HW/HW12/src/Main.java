import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Graph g = new Graph();
        int n = 2;
        int[] wells1 = {1,1};
        int[][] pipes1 = {{1,2,1},{1,2,2}};
        int minCost = g.minCostToSupplyWater(n, wells1, pipes1);
        System.out.println("minimum cost: " + minCost);


//        System.out.println("We can supply water with cost " + minCost + " using one of the following options:");
//        for (int i = 1; i <= n; i++) {
//            for (int j = i + 1; j <= n; j++) {
//                int cost = wells1[i - 1] + wells1[j - 1];
//                System.out.println("Option " + (i * n + j - n - 1) + ":");
//                System.out.println("  - Build a well inside house " + i + " with cost " + wells1[i - 1] + ".");
//                System.out.println("  - Build a well inside house " + j + " with cost " + wells1[j - 1] + ".");
//                System.out.println("The total cost will be " + cost + ".");
//            }
//        }
    }
}
