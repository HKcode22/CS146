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


    }
}
