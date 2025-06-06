package dsa_discussion.array;

import java.util.Arrays;

public class MoveNegativeElement {


    static int[] moveNegetive(int[] arr){
        int p=0;
        int n=0;
        while(p<arr.length){

            if(arr[p]<0){
                int temp=arr[p];
                arr[p]=arr[n];
                arr[n]=temp;
                n++;
            }
            p++;
        }
        return arr;

    }
    public static void main(String[] args) {
        int[ ] arr={0,20,14,-23,21,-10};
        System.out.println(Arrays.toString(moveNegetive(arr)));

    }
}


/*
i/p: 10,20,14,-23,21,-10

  n=0;
  p=0;


 */
