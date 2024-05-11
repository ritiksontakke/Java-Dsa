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
     
         //spiral martix que dsa

     public static void printSpiral(int martix[] []) {
       int startRow = 0;
       int startCol = 0;
       int endRow = martix.length - 1;
       int endCol = martix[0].length - 1;

       while( startRow <= endRow && startCol <= endCol ){
        //top
         for(int j = startCol ; j<=endCol; j++){
            System.out.print(martix[startRow][j] + " ");
         }
         //right
         for (int i= startRow+1; i<=endRow; i++){
          System.out.print(martix[i][endCol] + " ");
         }
          //bottom
         for (int j=endCol-1; j>=startCol; j--){
          if(startRow==endRow){
              break;
          }
          System.out.print(martix[endRow][j]+" ");
         }
           //left
          for(int i=endRow-1; i>=startRow+1; i--){
            if(startCol==endCol){
              break;
            }
            System.out.print(martix[i][startCol] + " ");
          }   
           
          startCol++;
          startRow++;
          endCol--;
          endRow--;

       }
          System.out.println();
     }


   public static void main(String args[]){
      int martix[] [] = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
      printSpiral(martix);
   }
}