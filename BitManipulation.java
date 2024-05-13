

public class BitManipulation {

    public static void OddorEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("even numbers");
        }else{
            System.out.println("odd numbers");
        }
    }
   
     public static int getIntBitMask(int n , int i){
        int bitMask = 1<<i;

        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
     }
   

     public static int setBitMask(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
     }

      
    //   public static int clearBit(int n, int i){
    //     int bitMask = 1<<i;
    //     return n & bitMask;
    //   }

    //   public static int updateIthBit(int n, int i, int newBit){
    //     if(newBit == 0) {
    //         return clearIthBit(n , i);
    //     }else{
    //        return setIthBit(n,i);
    //     }
    //   }


     public static int clearIthBit(int n, int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
     }
   
     public static int rangBit(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b ;
        return n & bitMask;
     }

    public static boolean(int n){
        return (n&(n-1))==0;
    }

    public static void main(String args []){
        //left shift
        // System.out.println((5<<2));

        //Right Shift 
        // System.out.println((5>>2)); 
       
    //    OddorEven(2);
    //    OddorEven(9);
          System.out.println(clearIthBit(10,2));

    }
}