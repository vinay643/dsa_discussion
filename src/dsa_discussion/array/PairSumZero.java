package dsa_discussion.array;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.

Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not contain any duplicate pairs.

Examples:

Input: arr = [-1, 0, 1, 2, -1, -4]
Output: [[-1, 1]]
Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
arr[2] + arr[4] = 1 + (-1) = 0.
The distinct pair are [-1,1].
 */
public class PairSumZero {
    static ArrayList<ArrayList<Integer>> uniquePairSumWithZero(int [] arr){
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        while(low<high){
            int sum=arr[low]+arr[high];
            int leftval=arr[low];
            int rightval=arr[high];
            if(sum==0){
                ArrayList<Integer> al2=new ArrayList<>();
                al2.add(arr[low]);
                al2.add(arr[high]);
                al.add(al2);


                while(low<high&&leftval==arr[low]){
                    low++;
                }

                while(low<high&&rightval==arr[high]){
                    high--;
                }
            } else if(sum<0){
                while(low<high&&leftval==arr[low]){
                    low++;
                }

            }else {
                while(low<high&&rightval==arr[high]){
                    high--;
                }

            }

        }
        return al;
    }

    public static void main(String[] args) {
        int [] arr={6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
        ArrayList<ArrayList<Integer>> al=uniquePairSumWithZero(arr);
        System.out.println(al);


    }
}
