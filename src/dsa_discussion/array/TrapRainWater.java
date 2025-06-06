package dsa_discussion.array;
/*
trapping rain water
Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.

Examples:

Input: arr[] = [3, 0, 1, 0, 4, 0 2]
Output: 10
Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.
 */
public class TrapRainWater {
    static int maxRainWater(int arr[]){
        int len=arr.length;
        int []mxl=new int[len];
        int [] mxr=new int[len];
        mxl[0]=arr[0];
        for(int i=1;i<len;i++){
            mxl[i]=Math.max(mxl[i-1],arr[i]);
        }
        mxr[len-1]=arr[len-1];
        for(int i=len-2;i>=0;i--){
            mxr[i]=Math.max(mxr[i+1],arr[i]);
        }
        int areaCount=0;
        for(int i=0;i<len;i++){
            areaCount+=(Math.min(mxl[i],mxr[i])-arr[i]);
        }
        return areaCount;


    }
    public static void main(String[] args) {
        int arr[]={3, 0, 1, 0, 4, 0, 2};
        System.out.println(maxRainWater(arr));

    }
}
