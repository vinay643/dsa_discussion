package dsa_discussion.array;

import java.util.Arrays;

/*
Given two sorted arrays a[] and b[] of size n and m respectively,
 the task is to merge them in sorted order without using any extra space.
Modify a[] so that it contains the first n elements and modify b[] so that it contains
the last m elements.

Examples:

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output:
2 2 3 4
7 10
Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10

 */
public class MergeWithoutExtraSpace {
    static int gapNext(int num){
        if(num<=1){
            return 0;
        }
        return (num/2)+num%2;
    }


    static void mergeSortedArray(int[] a,int[] b){
        int n=a.length;
        int m=b.length;
        int gap=gapNext(n+m);
        while(gap>0){
            int i=0;
            int j=gap;
            while(j<n+m){
                if(i<n&&j<n){
                    if(a[i]>a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;

                    }
                }
                if(i<n&&j>=n){
                    if(a[i]>b[j-n]){
                        int temp=a[i];
                        a[i]=b[j-n];
                        b[j-n]=temp;

                    }
                }
                if(i>=n&&j>=n){
                    if(b[i-n]>b[j-n]){
                        int temp=b[i-n];
                        b[i-n]=b[j-n];
                        b[j-n]=temp;

                    }
                }
                i++;
                j++;
            }
            gap=gapNext(gap);
        }

    }

    public static void main(String[] args) {
        int arr1[]={2, 4, 7, 10};
        int arr2[]={2,3};
        mergeSortedArray(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
