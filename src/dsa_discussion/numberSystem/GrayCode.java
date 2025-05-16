package dsa_discussion.numberSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class GrayCode {
    static ArrayList<String> graCode(int n){

        if(n==1){
            ArrayList<String> al=new ArrayList<>();
            al.add("0");
            al.add("1");
            return al;
        }

        ArrayList<String > al1=graCode(n-1);
        ArrayList<String>al2=new ArrayList<>();
        for(int i=0;i<al1.size();i++){
            al2.add("0"+al1.get(i));

        }
        for(int i=al1.size()-1;i>=0;i--){
            al2.add("1"+al1.get(i));
        }

        return al2;


    }
    public static void main(String[] args) {

        System.out.println((graCode(5)));

    }
}
/*

  0
  1

  00
  01
  11
  10

   00->00
   01->01
   10->11
   11->10

   000
   001
   011
   010
   110
   111
   101
   100

   n=3===>(000,001,011,010,110,111,101,100)
    |
    |
    |
    *
   n=2 ==>(00,01,11,10)
    |
    |
    |
    *
   n=1 ==>(0,1)

 */
