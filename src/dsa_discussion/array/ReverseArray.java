package dsa_discussion.array;

import java.util.Arrays;

public class ReverseArray {


    static int[] revArray(int [] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return arr;



    }
    public static void main(String[] args) {
        int [] arr={10,20,30,40};
       // System.out.println(Arrays.toString(revArray(arr)));
        int [] arr1=revArray(arr);
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }

}
/*
arr =>10,20,30,40

 find kth maximum in the array
 oi/p: 20,10,32,50,21
     k=2
  o/p:32


 */
