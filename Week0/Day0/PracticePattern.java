package Week0.Day0;

public class PracticePattern {

    public static void pattern0(int n){

    }

    public static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }

    public static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println("");
        }
    }

    public static void pattern3(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }

    }
    public static void pattern4(int n){
        int k=1;
        for (int i = 1; i <= n; i++) {
            for (int j=0; j < i; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        pattern4(4);
    }
}
