package dsa_discussion.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FactorialOfBigNumber {
    static void maltiply(List<Integer> fac,int x){
        int carray=0;
        for(int i=0;i<fac.size();i++){
            int product=fac.get(i)*x+carray;
            fac.set(i,product%10);
            carray=product/10;
        }
        while(carray>0){
            fac.add(carray%10);
            carray=carray/10;
        }
    }
    static List<Integer> bidNumberFactorial(int n){
        List<Integer> fac=new ArrayList<>();
        fac.add(1);
        for(int i=2;i<=n;i++){
            maltiply(fac,i);
        }

        Collections.reverse(fac);
        return fac;
    }
    public static void main(String[] args) {
        System.out.println(bidNumberFactorial(88));

    }
}
