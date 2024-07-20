package Week0.Day1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Pattern");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int n=sc.nextInt();
        // for (int i=0;i <n; i++) {
        //     System.out.print("*"+ "\t");
        // }

        // for (int i=1;i <=n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("*"+ "\t");
        //     }
        //     System.out.println();
        // }

        // for (int i=1;i <=n; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*"+ "\t");
        //     }
        //     System.out.println();
        // }

        // for (int i=1;i <=n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for (int i=n;i >=1; i--) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i=n;i >=1; i--) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print("     ");
        //     }
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if((i==1 || i==n || j==1 || j==n)){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    System.out.print("*");
                }
                if(i+j==n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        sc.close();
        
    }
    
}
