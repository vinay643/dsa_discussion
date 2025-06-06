package dsa_discussion.array;

public class KadaneAlgo {
    /*
    Given an integer array arr[]. You need to find the maximum sum of a subarray.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
     */
    static  int maxSumSubarray(int [] arr){

        int currsum=arr[0];
        int maxsum=arr[0];
        for(int i=0;i<arr.length-1;i++){

            currsum=Math.max(arr[i+1],currsum+arr[i+1]);
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSumSubarray(arr));

    }
}
