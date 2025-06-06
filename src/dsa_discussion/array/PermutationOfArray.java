package dsa_discussion.array;

import java.util.ArrayList;

/*
permutation of the array problem
 */
public class PermutationOfArray {
    static ArrayList<ArrayList<Integer>> pal=new ArrayList<>();
    static void printPermutationOfArray(int[] arr, ArrayList<Integer> al){
        if(arr.length==0){
            System.out.println(al);
            pal.add(new ArrayList<>(al));
            return;
        }
        for(int i=0;i<arr.length;i++){
            Integer val=arr[i];
            ArrayList<Integer> al1=new ArrayList<>();
            ArrayList<Integer>ar1=new ArrayList<>();
            for(int j=0;j<i;j++){
                al1.add(arr[j]);
            }
            for(int k=i+1;k<arr.length;k++){
                ar1.add(arr[k]);

            }
            int arr1[]=new int[al1.size()+ar1.size()];
            for(int m=0;m<al1.size();m++){
                arr1[m]=al1.get(m);
            }
            int n=al1.size();
            for(int p=0;p<ar1.size();p++){
                arr1[n]=ar1.get(p);
                n++;
            }
            al.add(val);
            printPermutationOfArray(arr1,al);
            al.remove(al.size()-1);

        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        ArrayList<Integer> al=new ArrayList<>();
        printPermutationOfArray(arr,al);
        int i=pal.indexOf(al1);
        System.out.println(i);
        System.out.println(pal);

    }
}
