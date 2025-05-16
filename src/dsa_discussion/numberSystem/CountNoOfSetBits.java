package dsa_discussion.numberSystem;

public class CountNoOfSetBits {

    //using bit manupulation
    static void countSetBit(int n){
        int count=0;
        while(n!=0){
            int mask=(n&(~n+1));
            n=n^mask;
            count++;
        }

        System.out.println(count);



    }

    public static void main(String[] args) {

        int n=10;
        String str=Integer.toBinaryString(n);

        int count=0;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='1'){
                count++;
            }

        }

        countSetBit(7);
        //System.out.println(count);

    }
}

/*
 count=0

 n=1011101  o/p=5
 m=0000001
 ^=1011100=n1   count=1
m1=0000100
^ =1011000=n2   count=2
m2=0001000
^ =1010000=n3   count=3
m3=0010000
^ =1000000=n4   count=4
m4=1000000
^ =0000000      count=5



 */
