package dsa_discussion.array;

import java.util.HashSet;

/*
Given an array arr[] of non-negative integers.
 Find the length of the longest sub-sequence such that
  elements in the subsequence are consecutive integers,
   the consecutive numbers can be in any order.

Examples:

Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
Output: 6
Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6.
 These 6 numbers form the longest consecutive subsquence.
 */
public class LongestSubSequenceLength {
    static int logestSubSequenceLength(int[] arr){
        HashSet<Integer> hs=new HashSet<>();
        for(int nums:arr){
            hs.add(nums);
        }
        int maxlen=0;
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i]-1)){
                int currnum=arr[i];
                int count=1;
                while(hs.contains(currnum+1)){
                    currnum++;
                    count++;
                }
                maxlen=Math.max(maxlen,count);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int [] arr={2, 6, 1, 9, 4, 5, 3};
        System.out.println(logestSubSequenceLength(arr));

    }
}
