package Week1.Assignment_1Sol;

import java.util.Scanner;

public class AssignMent_1Sol {
    public static void q1(int n){
        int evenSum=0;
        int oddSum=0;
        while(n!=0){
            int lastNumO=n%10;
            oddSum+=lastNumO;
            n=n/10;
            int lastNumE=n%10;
            evenSum+=lastNumE;
            n=n/10;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
    public static void q2(int n,int a){
        int count=0;
        while(n!=0){
            int lastnum=n%10;
            if(lastnum==a){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
    public static int q3(int n){
        int prevNum=0;
        while(n!=0){
            int lastnum=n%10;
            prevNum=prevNum*10+lastnum;
            n=n/10;
        }
        return prevNum;
    }
    public static double q4(int n){
        double sum=0;
        int power=0;
        while(n!=0){
            int lastnum=n%10;
            double powerTwo=Math.pow(2, power);
            power++;
            sum=sum+lastnum*powerTwo;
            n=n/10;
        }
        return sum;
    }
    public static void q7(int min, int max, int step){
        for (int i = min; i <=max; i=i+step) {
            double c=(5.0/9.0)*(i-32);
            System.out.println(i+" "+(int)c);
        }
    }
    public static void q9(int n){
        int flag=0;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                System.out.println("Not Prime");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime");
        }
        
    }
    // public static void q8(int n){
    //     int count=0;
    //     while(n!=0){
    //         n=n/10;
    //         count++;
    //     }
    //     int[] arr=new int[count];
    //     for (int i = 1; i <= count; i++) {
    //         int lastnum=n%10;
    //         arr[i]=lastnum;
    //     }
    //     for (int i = 1; i <= count; i++) {
    //         int index=arr[i];
    //         if (index >= 0 && index < count) {
    //             arr[index] = i;
    //         }
    //     }
    //     for (int i = 0; i < count; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
        
    // }

    public static void q8(int n){
        int count = 0;
        int temp = n;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        
        int[] arr = new int[count];
        int[] arr2 = new int[count];
        
        for (int i = 0; i < count; i++) {
            int lastnum = n % 10;
            arr[count-1-i] = lastnum;
            n = n / 10;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

        int indexarr=0;
        for (int i = count-1; i >=0; i--) {
            int index = arr[i];
            if (index >=0 && index <=count) {
                arr2[count-index] = indexarr+1;
                indexarr++;
            }
        }
        
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.print(arr2[i] + " ");
        }

        int sum=0;
        for (int i = 0; i <count; i++) {
            int firstNum=arr2[i];
            for (int j = 0; j < count-i-1; j++) {
                firstNum=firstNum*10;
            }
            sum+=firstNum;
        }
        System.out.println();
        System.out.println(sum);
    }
    
        public static long replace(int n) {
            // Special case for single zero
            if (n == 0) {
                return 5;
            }
    
            int temp = n;
            int count = 0;
    
            // Handle negative numbers separately
            boolean isNegative = n < 0;
            if (isNegative) {
                n = -n;
            }
    
            // Calculate the number of digits
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            
            int[] arr = new int[count];
            
            // Extract digits and replace 0 with 5
            for (int i = 0; i < count; i++) {
                arr[count - 1 - i] = n % 10;
                if (arr[count - 1 - i] == 0) {
                    arr[count - 1 - i] = 5;
                }
                n = n / 10;
            }
    
            // Reconstruct the number
            long sum = 0;
            for (int i = 0; i < count; i++) {
                sum = sum * 10 + arr[i];
            }
    
            // Restore the negative sign if needed
            if (isNegative) {
                sum = -sum;
            }
    
            return sum;
        }
        public static void seriesPrint(int a, int b){
            int k=0;
            for (int i = 1; i <=a+k; i++) {
                int ans=3*i+2;
                if(ans%b!=0){
                    System.out.println(ans);
                }
                else{
                    k++;
                }
            }
        }
    
        public static void arm(int a, int b){
            for(int i=a;i<=b;i++){
                int temp1=i;
                int n=i;
                int count=0;
                while(temp1!=0){
                    temp1=temp1/10;
                    count++;
                }
                int sum=0;
                while(n!=0){
                    int lastnum=n%10;
                    int multi=1;
                    for(int j=0;j<count;j++){
                        multi=multi*lastnum;
                    }
                    sum+=multi;
                    n=n/10;
                }
                if(sum==i){
                    System.out.println(sum);
                }
            }
        }


        public static int fibbo(int n){
            if(n==0){
                return 0;
            }
            else if(n==1 || n==2){
                return 1;
            }
            else{
                return fibbo(n-2)+fibbo(n-1);
            }
            
        }


        public static int gcd(int a, int b){
            int min;
            if(a<b){
                min=a;
            }
            else{
                min=b;
            }
            int largest=-1;
            for(int i=1;i<=min;i++){
                if(a%i==0 && b%i==0){
                    largest=i;
                }
            }
            return largest;
        }
        public static int lcm(int a, int b){
            int smallest=-1;
            int multi=a*b;
            
            for(int i=multi;i>=1;i--){
                if(i%a==0 && i%b==0){
                    smallest=i;
                }
            }
            return smallest;
        }
        public static long replaceZeroesWithFives(long n) {
            if (n == 0) {
                return 5;
            }
    
            long result = 0;
            long multiplier = 1;
    
            while (n > 0) {
                long digit = n % 10;
                if (digit == 0) {
                    digit = 5;
                }
                result = digit * multiplier + result;
                multiplier *= 10;
                n /= 10;
            }
    
            return result;
        }
    
        // public static int boston(long n){
        //     long n1=n;
        //     long[] arr=new long[100];
        //     int index=0;
        //     for(int i=2;i<=n;i++){
        //         if(n%i==0){
        //             n=n/i;
        //             arr[index]=i;
        //             i--;
        //             index++;
        //         }
        //     }
        //     // for(int i=0;i<index;i++){
        //     //     System.out.println(arr[i]+" ");
        //     // }
        //     long sum=0;
        //     while(n1!=0){
        //         long lastNum=n1%10;
        //         sum+=lastNum;
        //         n1=n1/10;
        //     }
        //     int multi=1;
        //     long preNum=0;
        //     for (int i = 0; i < index; i++) {
        //         long fN=arr[i];
        //         preNum=preNum*multi+fN;
        //         multi=multi*10;
                
        //     }
        //     long formSum=0;
        //     while (preNum!=0) {
        //         long lasDigi=preNum%10;
        //         formSum+=lasDigi;
        //         preNum/=10;
        //     }

        //     long primeSumNum=0;
        //     for(int i=0;i<index;i++){
        //         primeSumNum=primeSumNum+arr[i];
        //     }
        //     if(sum==formSum){
        //         return 1;
        //     }
        //     else{
        //         return 0;
        //     }
    
        // }
    
        // public static void boston(int n){
        //     int n1=n;
        //     int prev=0;
        //     int multi=1;
        //     for(int i=2;i<=n;i++){
        //         if(n%i==0){
        //             System.out.println(i);
        //             if(i>=10){
        //                 prev=prev*100+i;
        //                 n=n/i;
        //                 i--;
        //             }
        //             else{
        //                 prev=prev*10+i;
        //                 n=n/i;
        //                 i--;
        //             }
        //         }
        //     }
        //     System.out.println("Factors :- "+prev);
        //     int primeSum=0;
        //     while(prev!=0){
        //         int lasDigi=prev%10;
        //         primeSum+=lasDigi;
        //         prev=prev/10;
        //     }
        //     int sum=0;
        //     while(n1!=0){
        //         int lastNum=n1%10;
        //         sum+=lastNum;
        //         n1=n1/10;
        //     }
        //     System.out.println(sum);
        //     System.out.println(primeSum);
        //     if(sum==primeSum){
        //         System.out.println(1);
        //     }
        //     else{
        //         System.out.println(0);
        //     }
    
        // }

        public static int primeFactSum(int n){
        int pSum=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                int factorSum=sumNum(i);
                pSum+=factorSum;
                n=n/i;
                i--;
            }
        }
        return pSum;
    }
    public static int sumNum(int n){
      int sum=0;
        while(n!=0){
            int lastDigit=n%10;
            sum+=lastDigit;
            n=n/10;
        }
        return sum;
    }
    public static void simpleInput(){
        // Scanner sc=new Scanner(System.in);
        // // int prevSum=INTEGER.MIN_VALUE;
        // int prevSum=0;
        // while(sc.hasNextInt()){
        //     int n=sc.nextInt();
        //     prevSum+=n;
        //     if(prevSum<0)
        //     break;
        //     else{
        //         System.out.println(n);
        //     }
        // }
    }













    public static long countDigit(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    public static long invertNum(long n) {
        // if (n == 0) {
        //     return 0;
        // }
        long temp = n;
        long temp1 = n;
        long prevNum = 0;
        long factor = 1;
        long lastNum = 0;
        while (n != 0) {
            lastNum = n % 10;
            long update = 9 - lastNum;
            if (update < lastNum) {
                lastNum = update;
            }
            prevNum += lastNum * factor;
            factor = factor * 10;
            n = n / 10;
        }
        long count = countDigit(temp);
        if (lastNum == 0) {
            long addi = 9;
            for (int i = 0; i < count-1; i++) {
                addi = addi * 10;
            }
            prevNum = addi + prevNum;
        }
        if (prevNum < temp1) {
            return prevNum;
            // System.out.println(prevNum);
        } else {
            return temp1;
            // System.out.println(temp1);
        }

    }


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(invertNum(n));

        // if(sumNum(n)==primeFactSum(n)){
        //     System.out.println(1);
        // }
        // else{
        //     System.out.println(0);
        // }
        sc.close();
    }
}




































// import java.util.*;
// public class Main {
//   public static int boston(int n){
//             int n1=n;
//             int prev=0;
//             int multi=1;
//             for(int i=2;i<=n;i++){
//                 if(n%i==0){
//                     prev=prev+i*multi;
//                     multi=multi*10;
//                     n=n/i;
//                     i--;
//                 }
//             }
//             // for(int i=2;i<=n;i++){
//             //     if(n%i==0){
                    
//             //             prev=prev*10+i;
//             //             n=n/i;
//             //             i--;
                    
//             //     }
//             // }
//             int primeSum=0;
//             while(prev!=0){
//                 int lasDigi=prev%10;
//                 primeSum+=lasDigi;
//                 prev=prev/10;
//             }
//             int sum=0;
//             while(n1!=0){
//                 int lastNum=n1%10;
//                 sum+=lastNum;
//                 n1=n1/10;
//             }
//             if(sum==primeSum){
//                 return 1;
//             }
//             else{
//                 return 0;
//             }
    
//         }
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             int n=sc.nextInt();
//             System.out.println(boston(n));
//             sc.close();
//         }
// }
    

