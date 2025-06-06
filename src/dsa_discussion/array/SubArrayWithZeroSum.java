package dsa_discussion.array;

import java.util.HashSet;
/*
Given an array of integers, arr[]. Find if there is a subarray (of size at least one) with 0 sum. Return true/false depending upon whether there is a subarray present with 0-sum or not.

Examples:

Input: arr[] = [4, 2, -3, 1, 6]
Output: true
Explanation: 2, -3, 1 is the subarray with a sum of 0.
 */

public class SubArrayWithZeroSum {
    static boolean isSubArrayWithZeroSum(int[] arr){

        HashSet<Integer> hs=new HashSet<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                return  true;
            }
            if(arr[i]==0){
                return true;
            }
            if(hs.contains(sum)){
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr={4, 2, -3, 1, 6};
        System.out.println(isSubArrayWithZeroSum(arr));

    }
}
