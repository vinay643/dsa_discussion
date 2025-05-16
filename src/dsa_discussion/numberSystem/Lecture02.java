package dsa_discussion.numberSystem;

public class Lecture02 {
    public static void main(String[] args) {
        int a=(-8>>2);
        System.out.println(Integer.toBinaryString(a)+"---->"+a);


        //1010
        //1110
        // 1010
        // 0100
        // 1110


        //31 0s 1

     // int mask=(1<<2);

       // System.out.println(Integer.toBinaryString(a|mask));

      // onBit();
      // checkBit();
       // toggleBit();





    }

    static  void onBit(){
        int num=10;//1010

        // mask 1101
        //1->0001  left shift by 1  0010 1's cimplement 1101 & 1010==>1000

        int mask=(~(1<<1));
        System.out.println(Integer.toBinaryString(num&mask));


    }
    static void checkBit(){
        // check 2nd last bit

        int num=8; //1010 & 0010 ==> 0000==>2
        int mask=(1<<1);
        System.out.println((num&mask)==0?false:true);
    }

    //for toggling the bit
    static void toggleBit(){
        int num=10; //1010 ^ 0010==>1000
        int mask=(1<<1);
        System.out.println(Integer.toBinaryString(num^mask));
    }

}
