package dsa_discussion.array;

import java.util.Arrays;

public class MinHeightDifference {
    /*
    Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.
The difference between the largest and the smallest is 8-3 = 5.
     */

    static int midDiffernce(int [] arr , int k){
       if(arr.length==0||arr.length==1) return 0;

        Arrays.sort(arr);

        int minh=arr[0]+k;
        int maxh=arr[arr.length-1]-k;
        int mindiff=arr[arr.length-1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
           int minh1=Math.min(minh,arr[i+1]-k);
           int  maxh1=Math.max(maxh,arr[i]+k);
            if(minh1<0){
                continue;
            }
            mindiff=Math.min(mindiff,maxh1-minh1);
        }
        return mindiff;


    }
    public static void main(String[] args) {
       int arr[]={1, 5, 8, 10};
       int k=2;
        System.out.println(midDiffernce(arr,k));
    }
}
