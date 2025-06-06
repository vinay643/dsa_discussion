package dsa_discussion.array;

import java.util.Arrays;

public class RotateArray {
    /*
arr={1,2,3,4,5}
op ={5,1,2,3,4}
 */
    static int[] rotateByone(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];

        }
        arr[0]=temp;
        return arr;


    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(rotateByone(arr)));

    }
}
/*
arr={1,2,3,4,5}
op ={5,1,2,3,4}
 */
