import java.util.*;
public class Graph {

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        List<int[]> edges = new ArrayList<>();
//        boolean[] visted = new boolean[n+1];
        Set<Integer> visited = new HashSet<>();


        List<List<int[]>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
//            System.out.println("At 0: " + graph.get(0).add(new int[]{wells[i], i + 1}));
//            System.out.println("At 1: " + graph.get(i + 1).add(new int[]{wells[i], 0}));
            graph.get(0).add(new int[]{wells[i], i + 1});
//            graph.get(i + 1).add(new int[]{wells[i], 0});
        }

//        for (int i = 0; i < n; i++) {
//            edges.add(new int[]{0, i + 1, wells[i]});
//        }

//        for (int[] pipe : pipes) {
//            edges.add(pipe);
//        }

//        System.out.println(graph.get(0));
//
//        for (int i = 0; i < graph.size(); i++) {
//            System.out.print(i + " -> ");
//            for (int[] edge : graph.get(i)) {
//                System.out.print("(" + edge[0] + ", " + edge[1] + ") ");
//            }
//            System.out.println();
//        }

//        edges.sort(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return Integer.compare(o1[2], o2[2]);
//            }
//        });

        for (int[] pipe : pipes) {
            int house1 = pipe[0];
            int house2 = pipe[1];
            int cost = pipe[2];
            graph.get(house1).add(new int[]{cost, house2});
            graph.get(house2).add(new int[]{cost, house1});
        }

//        edges.addAll(Arrays.asList(pipes));

        for (int i = 0; i < graph.size(); i++) {
            System.out.print("House " + i + ": ");
            for (int[] edge : graph.get(i)) {
                System.out.print("(" + edge[0] + ", " + edge[1] + ") ");
            }
            System.out.println();
        }


        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int mincost = 0;
        q.addAll(graph.get(0));

        while (!q.isEmpty()) {
            int[] edge = q.poll();
            int cost = edge[0];
            int house = edge[1];
            if (!visited.contains(house)) {
                visited.add(house);
                mincost += cost;
                for (int[] neighbor : graph.get(house)) {
                    if (!visited.contains(neighbor[1])) {
                        q.offer(neighbor);
                    }
                }
            }
        }


//        visted[0] = true;
//        q.addAll(edges);

//        while (!q.isEmpty()) {
//            int[] edge = q.poll();
//            int h1 = edge[0];
//            int h2 = edge[1];
//            int cost = edge[2];
//
//            graph.get(h1).add(new int[]{cost, h2});
//            graph.get(h2).add(new int[]{cost, h1});
//
//            if (!visted[h2]) {
//                visted[h2] = true;
//                mincost += cost;
//
//            }
//
//            for(int i = 0; i<edges.size(); i++){
//                int[] next = edges.get(i);
//                if(next[0] == h2 && !visted[next[1]]){
//                    q.offer(next);
//                }
//            }

//            for (int i = 0; i < graph.size(); i++) {
//                System.out.print(i + " -> ");
//                for (int[] e : graph.get(i)) {
//                    System.out.print("(" + e[0] + ", " + e[1] + ") ");
//                }
//                System.out.println();
//            }

//            for (int[] next : edges) {
//                if (next.length >= 3 && next[0] == h2 && !visted[next[1]]) {
//                    q.offer(next);
//                }
//            }
//        }


        return mincost;
    }
}