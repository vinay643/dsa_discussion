package dsa_discussion.array;

import java.util.HashMap;

public class AbsolutePair {
    static int countAbsPair(int arr[],int k){

        int len=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
       int pair=0;
        for(int i=0;i<len;i++){
            if(true){
                pair++;
                hm.put(arr[i],hm.get(arr[i])-1);
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,5,4};
       int p= countAbsPair(arr,2);
        System.out.println(p);

    }
}

/*

arr={5,3,4,5,8,7} k=2
o/p:3
5=2


i+-j=|k|
i+j=k
k+j=i
 */
