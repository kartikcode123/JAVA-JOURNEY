package practice;
import java.util.*;

class MergeInterval {
    public static int[][] merge(int[][] intervals) {
        //1. Sort the intervals on the basis of start values in the intervals - O(n logn)
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        //2. Iterating over all the intervals 
        // Looking for the overlapping and non-overlapping pairs
        LinkedList<int[]> merged = new LinkedList<>();
        // O(n)
        for(int[] interval: intervals){
            // No overlapping
            // lastEnd < currentStart
            // [0] - start
            // [1] - end
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            }
            // Overlapping condition
            else{
                // max(lastEnd, currEnd)
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        // conversion of the linked list to an array
        return merged.toArray(new int[merged.size()][]);

        
    }
    public static void main(String[] args) {
        int arr[][]={{1,3},{5,7},{2,4},{6,8}};
        int arr1[][]=new int[4][2];
        arr1=merge(arr);
        for(int[]ele:arr1){
            System.out.println(ele);
        }
    }
}

