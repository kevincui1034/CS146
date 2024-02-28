import java.util.Arrays;

public class HW7 {
    public int minMeetingRooms(int[][] intervals) {
        // Catches improper input
        if (intervals == null || intervals.length == 0)
            return 0; // or throw an exception for incorrect formatting
        
        // Puts start and end into different arrays
        int[] start_time = new int[intervals.length];
        int[] end_time = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            start_time[i] = intervals[i][0];
            end_time[i] = intervals[i][1];
        }
        Arrays.sort(start_time);
        Arrays.sort(end_time);
        
        // Initialize pointers
        int in_use = 0;
        int start = 0;
        int end = 0;
        int intervals_size = intervals.length;
        
        // Iterate through the intervals
        while (start < intervals_size) {
            if (start_time[start] >= end_time[end]) {
                // Takes out a room
                in_use--;
                end++;
            }
            // Room in use
            in_use++;
            start++;
        }
        return in_use;
    }

    public static void main(String[] args) {
        HW7 hw7 = new HW7();
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        int[][] intervals2 = {{0, 1}, {1, 2}, {2, 3}};
        System.out.println(hw7.minMeetingRooms(intervals1));
        System.out.println(hw7.minMeetingRooms(intervals2));
    }
}
