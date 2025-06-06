package dsa_discussion.array;
/*
Given an array of integers arr[]. Find the Inversion Count in the array.
Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum.

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
 */
public class CountInversion {
    static int countInversion(int[] arr){
        return sortCount(arr,0,arr.length-1);
    }
    static int sortCount(int[]arr,int low,int high){
        int mid=(low+high)/2;
        int count=0;
        if(low<high){
            count =count+sortCount(arr,low,mid);
            count=count+sortCount(arr,mid+1,high);
            count=count+mergeAndCount(arr,low,mid,high);

        }
        return count;
    }
    static int mergeAndCount(int[] arr,int low,int mid,int high){
        int [] left=new int[mid-low+1];
        int [] right=new int[high-mid];

        for(int i=0;i<left.length;i++){
            left[i]=arr[low+i];

        }
        for(int i=0;i<right.length;i++){
            right[i]=arr[mid+1+i];

        }
        int i=0;
        int j=0;
        int k=low;
        int count=0;
        while(i<left.length&&j<right.length){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
                count=count+(left.length-i);

            }
        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={2, 3, 4, 5, 6};
        System.out.println(countInversion(arr));

    }
}
