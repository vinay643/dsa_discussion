package dsa_discussion.array;

import java.util.ArrayList;
import java.util.Arrays;

/*

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class MergeInterval {
    static int[][] mergeIntervals(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> al=new ArrayList<>();

        int [] curr=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int [] next=intervals[i];
            if(curr[1]>=next[0]){
                curr[1]=Math.max(curr[1],next[1]);
            } else  {
                al.add(curr);
                curr=next;

            }
        }
        al.add(curr);
        int len=al.size();
        int[][] arr1=new int[len][2];
        for(int i=0;i<len;i++){
            arr1[i]=al.get(i);
        }
        return arr1;


    }
    public static void main(String[] args) {
        int [][] arr1={
            {1,3},
            {2,6},
            {8,10},
            {15,18}
        };
//        System.out.println(Arrays.toString(mergeIntervals(arr1)));
        int[][] arr2=mergeIntervals(arr1);
        for(int i=0;i<arr2.length;i++){
            System.out.print(Arrays.toString(arr2[i])+" ");
        }

    }
}
