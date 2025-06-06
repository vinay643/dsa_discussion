package dsa_discussion.array;

public class K_maxElement {

    static int maxElement(int [] arr){
        int index=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return  index;
    }

    static  int k_thMax(int[] arr,int k){
        for(int i=0;i<k-1;i++){
            int index=maxElement(arr);
            arr[index]=Integer.MIN_VALUE;
        }
        return arr[maxElement(arr)];

    }
    public static void main(String[] args) {

        int [] arr={ 20,10,32,50,21};
        System.out.println(k_thMax(arr,2));

    }
}

/*
find kth maximum in the array
 oi/p: 20,10,32,50,21
     k=2
  o/p:32 or 2 as index
   for(int i=0;i<k-1;i++){
            int index=maxElement(arr);
            arr[index]=Integer.MIN_VALUE;
        }
        return maxElement(arr);
  maxIndex=3
  20 10 32 min 21



 */
