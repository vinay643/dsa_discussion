package dsa_discussion.numberSystem;

public class Lecture_01 {
    public static void main(String[] args) {


//        int num=8;
//        String rem="";
//        while(num>0){
//            int a=num%2;
//            rem=a+rem;
//            num=num/2;
//        }


        int num=8;
        long rem=0;
        int temp=1;
        while(num>0){
            int a=num%2;
            rem=rem+a*temp;
            temp=temp*10;
            num=num/2;
        }

        System.out.println(rem);

    }
}
