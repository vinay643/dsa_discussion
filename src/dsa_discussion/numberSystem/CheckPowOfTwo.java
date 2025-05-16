package dsa_discussion.numberSystem;

public class CheckPowOfTwo {
    public static void main(String[] args) {

        int n=6;
        System.out.println((n&n-1)==0?"True":"False");
    }
}

/*

4-->true -->100

3-->        011

8->1000
7->0111
&->0000

6->110
5->101
&->100

6-->false-->110




 */
