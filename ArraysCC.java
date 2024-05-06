import java.util.*;

public class ArraysCC {

   public static int getLargest(int numbers[]) {
       int lagerst= Integer.MIN_VALUE;

       for (int i=0; i<numbers.length; i++){
        
        if( lagerst < numbers[i] ){

            lagerst = numbers[i];
        }
           
       }
       return lagerst;
   }


    public static void main(String args[]){
      
      int numbers[] = {1,2,9,5};
     System.out.print("largest  " +getLargest(numbers) );
     

    }
}