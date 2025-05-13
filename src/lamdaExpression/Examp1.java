package lamdaExpression;
import java.util.*;
@FunctionalInterface
interface Addition{
    void add(int a,int b);
}
public class Examp1 {
    public static void main(String[] args) {
        Addition ad=(a,b)->System.out.println("sum of two number: "+(a+b));
        ad.add(10,20);

    }




}
