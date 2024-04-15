
public class Main {
    public static void main(String[] args) {

        Graph g = new Graph();

        int numCourses = 2;
        int [][] preq1 = {{1,0}};
        System.out.println(g.canFinish(numCourses, preq1)); 
        int[][] preq2 = {{1, 0}, {0, 1}};
        System.out.println(g.canFinish(numCourses, preq2));


    }
}
