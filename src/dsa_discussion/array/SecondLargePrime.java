package dsa_discussion.array;

import java.util.ArrayList;

public class SecondLargePrime {

    static int secondLargePrime(int [] arr){
        int len=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<len;i++){
            if(isPrime(arr[i])) al.add(arr[i]);
        }
        int max1=Integer.MIN_VALUE;
        int in=0;
        for(int i=0;i<al.size();i++){
            if(al.get(i)>max1){
                max1=al.get(i);
                in=i;
            }

        }
        System.out.println(in);
      //  al.set(in,Integer.MIN_VALUE);
        al.remove(in);

        System.out.println(al);
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<al.size();i++){
            if(al.get(i)>max2){
                max2=al.get(i);

            }

        }

        return max2;

    }
    static int secodPrime(int arr[]){
        int len=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<len;i++){
            if(isPrime(arr[i])) al.add(arr[i]);
        }
        return al.get(1);

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int arr[]={4,10,7,2,8,17};
       int res= secondLargePrime(arr);
        System.out.println(res);

    }
}

/*
arr={4,10,7,2,8,17}
o/p=7
 */
