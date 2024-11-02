package Week7.Day1;

public class RecursionJava {
    public static int facto(int n){
        if(n==0||n==1){
            return 1;
        }
        int x= n*facto(n-1);
        return x;
    }


    public static int power(int a,int b){
        if(b==0){
            return 1;
        }
        int x=a*power(a, b-1);
        return x;
    }



    public static int factoTail(int n,int x){
        if(n==1 ||n==0){
            return x;
        }
        return factoTail(n-1, n*x);
    }


    
    public static void main(String[] args) {
        // int ans=facto(5);    
        // System.out.println(ans);
        System.out.println(factoTail(5, 1));
        // long startTime = System.nanoTime();
        // long stopTime = System.nanoTime();
        // System.out.println(stopTime - startTime);
    }
}
