package dsa_discussion.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArray {
    static void freqArray(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            int count=1;
            for(int j=i+1;j<len;j++){
                if(arr[i]==arr[j]){
                    arr[j]=arr[len-1];
                    count++;
                    j--;
                    len--;
                }
            }
            System.out.println(arr[i]+"------> "+count);
        }

    }

    static void freqUsingMap(int arr[]){
        int len=arr.length;
        HashMap<Integer,Integer> fm=new HashMap<>();
        for(int i=0;i<len;i++){
            if(fm.containsKey(arr[i])){
                fm.put(arr[i],fm.get(arr[i])+1);
            }else{
                fm.put(arr[i],1);
            }
           // fm.put(arr[i],fm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> mp:fm.entrySet()){
            Integer ele=mp.getKey();
            Integer fre=mp.getValue();
            System.out.println(ele+"--------> "+fre);
        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,2,1,5,2,5};
        //freqArray(arr);
        freqUsingMap(arr);


    }
}
/*


 arr=[1,2,2,1,5,2,5]
 i=0;i<len;i++
  count =1
  j=i+1;i<len;j++
  if(arr[i]==arr[j])
  count++
  arr[j]=arr[len-1]
  j--
  len--

  sout(arr[i]----->count)

 */
