
public class RecursionBasics{

    public static void printInc(int n){
        if (n == 1){
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }


    public static int calcSum(int n){
         if( n==1 ){
            return 1;
         }


        int Snm1 = calcSum(n-1);
        int Sn = n+Snm1;
        return Sn;
    }

    public static int fib(int n){
        if(n==0 || n==1){
                return n;
        }
        
        

        int fnm1= fib(n-1);
        int fnm2= fib(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }


    public static int tilingPro(int n){

       if(n == 0 || n == 1){
            return 1;
       }


        int fnm1 = tilingPro(n-1);
        int fnm2 = tilingPro(n-2);
        int totWay = fnm1 + fnm2;
        return totWay;
    }

    public static void main(String args []){
       System.out.print(tilingPro(2));
    }
}