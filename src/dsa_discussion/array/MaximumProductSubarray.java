package dsa_discussion.array;

public class MaximumProductSubarray {
    static int maxProductSubarray(int [] arr){
      /*  int currpod=1;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            currpod*=arr[i];
            if(currpod==0){
                currpod=1;
            }
            ans=Math.max(ans,currpod);
        }
        currpod=1;
        for(int i=arr.length-1;i>=0;i--){
            currpod*=arr[i];
            if(currpod==0){
                currpod=1;
            }
            ans=Math.max(ans,currpod);

        }

       */
        int minEnding=arr[0];
        int maxEnding=arr[0];
        int maxfar=arr[0];
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            if(curr<0){

                int temp=minEnding;
                minEnding=maxEnding;
                maxEnding=temp;

            }

            maxEnding = Math.max(curr, curr * maxEnding);
            minEnding = Math.min(curr, curr * minEnding);
            maxfar=Math.max(maxfar,maxEnding);
        }
        return maxfar;
    }
    public static void main(String[] args) {
        int arr[]={6 ,-3, -10, 0, 2};
        System.out.println(maxProductSubarray(arr));

    }
}
