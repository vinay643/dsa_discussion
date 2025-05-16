package dsa_discussion.numberSystem;

public class RightMostBitMask {

    public static void main(String[] args) {

        int n=8;
        int mask=(n&(~n+1));
        System.out.println(Integer.toBinaryString(n&mask));

    }

}

/*
     n=101000100  n'=010111011
                            +1
             n''     010111100===>n&n''=>000000100

  mask=000000100
 */
