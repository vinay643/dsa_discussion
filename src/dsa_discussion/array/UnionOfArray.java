package dsa_discussion.array;

import java.util.HashSet;

/*
Given two arrays a[] and b[], the task is to find the number of elements in the union between these two arrays.

The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one element occurrence should be there in the union.

Note: Elements of a[] and b[] are not necessarily distinct.

Examples

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
Output: 5
Explanation: Union set of both the arrays will be 1, 2, 3, 4 and 5. So count is 5.
 */
public class UnionOfArray {
    static int unionCount(int[]a,int[]b){
        int len1=a.length;
        int len2=b.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<len1;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<len2;i++){
            hs.add(b[i]);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int [] a={1, 2, 3, 4, 5};
        int [] b={1, 2, 3};
        System.out.println(unionCount(a,b));

    }


}
