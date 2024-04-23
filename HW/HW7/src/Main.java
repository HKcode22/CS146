import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> min = new PriorityQueue<>();

//        for (int[] interval : intervals) {
        for (int i = 0; i < intervals.length; i++) {
//            int[] interval = intervals[i];
            if (!min.isEmpty() && min.peek() <= intervals[i][0]) {
                min.poll();

            }
//            System.out.println("Min peak: " + min.peek());
//            System.out.println("Min: "+ min);
//            System.out.println("Intervals: " + intervals[i][0]);
//            System.out.println("Interval: " + interval[0]);
//            System.out.println("min size: " + min.size());
//            System.out.println("------------");
            min.offer(intervals[i][1]);
        }


        return min.size();
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{0,30},{5,10},{15,20}};
        System.out.println("Minimum Number of Servers Required: " + minMeetingRooms(intervals1));

        int[][] intervals2 = {{0,1},{1,2},{2,3}};
        System.out.println("Minimum Number of Servers Required: " + minMeetingRooms(intervals2));
    }
}








// // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// // then press Enter. You can now see whitespace characters in your code.
// import java.util.Arrays;
// import java.util.PriorityQueue;

// public class Main {

//     public int minMeetingRooms(int[][] intervals) {  // Your code here

//         Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
//         PriorityQueue<Integer> minheap = new PriorityQueue<>();

//         minheap.offer(intervals[0][1]);

//         for(int i=1; i<intervals.length; i++){
//             if
//         }

//     }




//         public static void main(String[] args) {






//     }
// }
