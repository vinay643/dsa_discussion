package dsa_discussion.array;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.



Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
 */
public class BooyerMoreVotingAlgorithm {
    static List<Integer> majority(int[] arr){
        int len=arr.length;
        int condi1=-1;
        int condi2=-1;
        int count1=0;
        int count2=0;
        for(int num:arr){
            if(num==condi1){
                count1++;
            }else if(num==condi2){
                count2++;
            } else if (count1==0) {
                condi1=num;
                count1=1;

            } else if (count2==0) {
                condi2=num;
                count2=1;

            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num:arr){
            if(num==condi1){
                count1++;
            } else if (num==condi2) {
                count2++;

            }
        }
        List<Integer> mc=new ArrayList<>();
        if(count1>len/3){
            mc.add(condi1);
        } else if (count2>len/3) {
            mc.add(condi2);

        }
        return mc;

    }
    public static void main(String[] args) {
        int [] arr={3,2,3};
        System.out.println(majority(arr));
    }
}
