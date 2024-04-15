import java.util.*;
public class Graph {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];

        List<List<Integer>> graph = new ArrayList<>();


        for (int i= 0;i < numCourses; i++){
            graph.add(new ArrayList<>());
        }


        for(int i=0; i<prerequisites.length;i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            graph.get(b).add(a);
            indegrees[a]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++){
            if (indegrees[i]== 0){
                q.offer(i);
            }
        }

        int count = 0;
        while (!q.isEmpty()) {
            int currentCourse=q.poll();
            count++;
            List<Integer> curCourselist = graph.get(currentCourse);
            for(int i=0; i<curCourselist.size(); i++){
                int nextcourse = curCourselist.get(i);
                int updatedindegree = indegrees[nextcourse] - 1;
                indegrees[nextcourse] = updatedindegree;
                if(updatedindegree == 0){
                    q.offer(nextcourse);
                }
            }
        }

        return count == numCourses;

    }

}
