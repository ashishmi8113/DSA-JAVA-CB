package Week8.Day0;

public class fibonacciClass {
    public static void fibo(int n){
        int a=0;
        int b=1;
        for (int i = 0; i <=n; i++) {
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }

    public static void subSequence(String p1,String p2){
        if(p1.length()==0){
            System.out.print(p2+" ");
            return;
        }
        char p3=p1.charAt(0);
        p1=p1.substring(1);
        subSequence(p1, p2+p3);
        subSequence(p1, p2);
    }
    public static void coinToss(int n, String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        coinToss(n-1, ans+"H");
        coinToss(n-1, ans+"T");
    }
    public static int countSub(String n){
        if(n.length()==0){
            return 1;
        }
        int l=countSub(n.substring(1));
        int r=countSub(n.substring(1));
        return l+r;
    }
    public static void main(String[] args) {
        // subSequence("Car", "");
        // System.out.println();
        System.out.println(countSub("12"));

    }
}
