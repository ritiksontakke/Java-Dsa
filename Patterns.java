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


   public static void half_pre(int n){
     for(int i=1 ; i<=n; i++){
        for(int j=1 ; j<=n-i; j++){
            System.out.print(" ");
        }

        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
     }
   }


    public static void Pra_Numbers(int n){
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
       
     public static void Floyd_trangle(int n){
         
         int counter = 1;
         for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++)
          {
              System.out.print(counter + " ");
              counter++;
          }
          System.out.println();
         }


     }
     

    public static void Hello_trangels(int n){
       
       //1st half
       for (i=)
     //star -i



     //spaces 2*(n-1)



     //star -1
     
    }


   public static void main(String args[]){
    //   hello_rectangles(4,5);
    //    half_pre(4);
    // Pra_Numbers(5);
    // Floyd_trangle(4);
   }
}