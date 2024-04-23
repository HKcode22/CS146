// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

    public int minMeetingRooms(int[][] intervals) {  // Your code here

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        minheap.offer(intervals[0][1]);

        for(int i=1; i<intervals.length; i++){
            if
        }

    }




        public static void main(String[] args) {






    }
}