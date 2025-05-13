package dsa_discussion.numberSystem;
//Input:
//n = 17 , l = 2 , r = 3
//Output:
//        23
//Explanation:
//        (17)10 = (10001)2.  After toggling all
//the bits from 2nd to 3rd position we get
//        (10111)2 = (23)10



//Input:
//n = 50 , l = 2 , r = 5
//Output:
//        44
//Explanation:
//        (50)10 = (110010)2.^  000010 =110000^000100=  After toggling all
//the bits from 2nd to 5th position we get
//        (101100)2 = (44)10
public class ToggleInRange {
    public static void main(String[] args) {

        int num =50;
        int l=2;
        int r=5;
        int tog=0;
        for(int i=l;i<=r;i++){
            int mask=(1<<(i-1));
           num= num^mask;

        }

        System.out.println(Integer.toBinaryString(num));
    }
}
