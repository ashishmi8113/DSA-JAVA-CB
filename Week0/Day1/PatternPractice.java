package Week0.Day1;
public class PatternPractice {
    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for (int i = n; i >=1; i--) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for (int i = n; i >=1; i--) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("    ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==j){
                    System.out.print("*");
                }
                if(i+j==n+1 && i!=j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for (int i = n; i >=1; i--) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // public static void pattern11(int n){
    //     for (int i = 1; i <=n; i++) {
    //         for (int k = 1; k <=n-i; k++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <=i; j++) {
    //             System.out.print("*");
    //         }
    //         for (int j = 0; j < array.length; j++) {
                
    //         }
    //         System.out.println();
    //     }
    // }
    public static void pattern11(int n){
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                if((j)%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <=i; j++) {
                if((i+j)%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                if(j%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print("!");
                }
            }
            for (int j = 1; j <= i-1; j++) {
                if((i+j)%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print("!");
                }
            }
            System.out.println();
        }
    }
    public static void pattern13(int n){
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >=1; i--) {
            
            for (int j = 1; j <=i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // public static void pattern14(int n){
    //     for (int i = 1; i <=n; i++) {
    //         for (int k = 1; k <=n-i; k++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <=i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for (int i = n; i >=1; i--) {
    //         for (int k = 0; k <=n-i; k++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 2; j <=i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void pattern14(int n){
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for (int i = n; i >=1; i--) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("    ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <=n; i++) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("    ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for (int i = n; i >=1; i--) {
            for (int k = 1; k <=i-1; k++) {
                System.out.print("    ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } 
        for (int i = 2; i <=n; i++) {
            for (int k = 1; k <=i-1; k++) {
                System.out.print("    ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void pattern17(int n){
        for (int i = n/2; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            // System.out.print(" ");
            for (int k = 1; k<=n/2-i+1 ; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=n/2-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <=n/2; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <=n/2-i; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n/2-i+1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // public static void pattern18(int n){
    //     for (int i = n/2; i >=1; i--) {
    //         for (int j = 1; j <=i; j++) {
    //             System.out.print(" ");
    //         }
    //         // System.out.print(" ");
    //         for (int k = 1; k<=n/2-i+1 ; k++) {
    //             System.out.print("*");
    //         }
    //         for (int k = 1; k <=n/2-i; k++) {
    //             System.out.print("*");
    //         }
    //         for (int j = 1; j <=i; j++) {
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //     }
    //     for (int j = 1; j <=n; j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     for (int i = 1; i <=n/2; i++) {
    //         for (int j = 1; j <=i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int k = 1; k <=n/2-i; k++) {
    //             System.out.print("*");
    //         }
    //         for (int k = 1; k <= n/2-i+1; k++) {
    //             System.out.print("*");
    //         }
    //         for (int j = 1; j <=i; j++) {
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //     }
    // }
    
    public static void pattern18(int n){
        for (int i = 1; i <=n/2; i++){
            for (int k = 1; k <=n/2-i+1; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int j = 1; j <=n; j++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = n/2; i >=1; i--) {
            for (int k = 1; k <=n/2-i+1; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern19(int n){
        for (int i = n/2+1; i >=1; i--) {
            for (int j = 1; j <=i && j<=n/2; j++) {
                System.out.print("*");
            }
            for (int k = 2; k <=n/2+1-i && k<=n/2; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=n/2+1-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <=n/2+1; i++) {
            for (int j = 1; j <=i && j<=n/2; j++) {
                System.out.print("*");
            }
            for (int k = 2; k <=n/2+1-i && k<=n/2; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=n/2+1-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern20(int n){
        for (int i = n/2+1; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                if(i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int k = 1; k <=n/2+1-i; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=n/2+1-i; k++) {
                if((i+k)==n/2+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i <=n/2+1; i++) {
            for (int j = 1; j <=i; j++) {
                if(i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int k = 1; k <=n/2+1-i; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=n/2+1-i; k++) {
                if((i+k)==n/2+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern21(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i &&j<=n-1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern22(int n){
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i &&j<=n-1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern23(int n){
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("1 ");
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
    public static void pattern24(int n){
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern25(int n){
        int x=1;
        for (int i = 1; i <=n; i++) {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("\t");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(x+"\t");
                x++;
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print(x+"\t");
                x++;
            }
            System.out.println();
        }
    }
    public static void pattern26(int n){
        for (int i = 1; i <=n; i++) {
        int x=1;            
            for (int k = 1; k <=n-i; k++) {
                System.out.print("\t");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"\t");
                x=j;
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print(x+j+"\t");
            }
            System.out.println();
        }
    }
    public static void pattern27(int n){
        for (int i = 1; i <=n; i++) {
            int x=1;
            for (int k = 1; k <=n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
                x=j;
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print(x-j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern28(int n){
        for (int i = 1; i <=n; i++) {
            int x=1;
            for (int k = 1; k <=n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+j-1+" ");
                x=i+j-1;
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print(x-j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern29(int n){
        for (int i = 1; i <=n; i++) {
            int x=1;
            for (int k = 1; k <=n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                if(j==1){
                    System.out.print(i+j-1+" ");
                    x=i+j-1;
                }
                else{
                    System.out.print("0 ");
                }
            }
            for (int j = 1; j <=i-1; j++) {
                if(j==i-1){
                    System.out.print(x+" ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern30(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
    public static void pattern31(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i+j==n+1){
                    System.out.print("* ");
                }
                else{

                    System.out.print(n-j+1+" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern32(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                if(j%2==0){
                    System.out.print("* ");
                    System.out.print(i+" ");
                }
                else{
                    if(j!=1){
                        System.out.print("* ");
                    }
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                if(j%2==0){
                    System.out.print("* ");
                    System.out.print(i+" ");
                }
                else{
                    if(j!=1){
                        System.out.print("* ");
                    }
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern0(int n){
        for (int i = 1; i <=n; i++) {
            for (int k = 4; k <=n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i && j<=n-3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern33(int n){ 
        
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=n-1; j++) {
                    if(i!=1){
                        if(i+j>=n+1){
                            System.out.print(j+" ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                for (int j = 1; j <=i; j++) {
                    if(n-j+1!=n){
                        System.out.print(n-j+1+" ");
                    }
                    else{
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
        }
        
        public static void main(String[] args){
            pattern33(10);
        }
    }
