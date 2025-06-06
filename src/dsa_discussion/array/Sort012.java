package dsa_discussion.array;

import java.util.ArrayList;

public class Sort012 {
    static ArrayList<Integer> sort012(int[] arr){
        int[] sparr=new int[3];

        for(int i=0;i<arr.length;i++){
            sparr[arr[i]]=sparr[arr[i]]+1;
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<sparr.length;i++){
            int count=sparr[i];
            for(int j=0;j<count;j++){
                al.add(i);
            }
        }
        return al;


    }

    public static void main(String[] args) {
        int [] arr ={0,0,1,0,1,1,2,0,2,1};
        System.out.println(sort012(arr));

    }
    /*   0 1 2
     sp=[0,0,0]
     arr={0,0,1,0,1,1,2,0,2,1}
          sp=[4,4,2]



     */
}
