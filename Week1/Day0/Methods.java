package Week1.Day0;

public class Methods {
    public static int facto(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*facto(n-1);
        }
    }
    static void swap(int a, int b){
        System.out.println("Initialy");
        System.out.println("a :- "+a);
        System.out.println("b :- "+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("Finally");
        System.out.println("a :- "+a);
        System.out.println("b :- "+b);
    }

    static void printNaturalNum(int n){
        for (int i = 1; i <=n; i++) {
            System.out.print(i+"  ");
        }
    }
    static boolean isPrime(int n){
        for (int i = 2; i <n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    static int reverseNum(int n){
        int reverse=0;
        int lastNum;
        while(n>0){
            lastNum=n%10;
            reverse=reverse*10+lastNum;
            n=n/10;
        }
        return reverse;
    }


    static int countDigit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }


    static boolean isArmStrong(int n){
        int numCopy=n;
        int count=countDigit(n);

        int lastNum;
        double result=0;

        while(n!=0) {
            lastNum=n%10;
            int multiply=1;
            for (int j = 1; j <=count; j++) {
                    multiply=multiply*lastNum;
            }
            result+=multiply;
            n=n/10;
        }

        if(result==numCopy){
            return true;
        }
        return false;
    }






    public static void main(String[] args) {
        int a=0071;
        System.out.println(countDigit(0071));
        System.out.println(countDigit(a));
        
    }
}
