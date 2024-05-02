import java.util.*;

public class Patterns{
   public static void hello_rectangles(int totRows, int totClos){
      for(int i=1 ; i<=totRows; i++ ){
        for(int j=1; j<=totClos; j++){
          if(  i==1 || i==totRows || j==1 || j==totClos){
            System.out.print("*");
        }else{
          System.out.print(" ");
        }
        
      } 
       System.out.println();
    }
   }

   public static void main(String args[]){
      hello_rectangles(4,5);
   }
}