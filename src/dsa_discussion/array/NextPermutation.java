package dsa_discussion.array;

import java.util.Arrays;

public class NextPermutation {
    static void reverse(int [] arr,int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    static void nextPermutation(int[] arr){
        int i=arr.length-2;
        while(i>=0&&arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;


        }
        reverse(arr,i+1,arr.length-1);
    }
    public static void main(String[] args) {

        int [] arr={1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }
}
