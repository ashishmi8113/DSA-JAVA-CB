package Week1.Assignment_1Sol;

// // public class invertDigit {
// //     public static long countDigit(long n) {
// //         int count = 0;
// //         while (n != 0) {
// //             n = n / 10;
// //             count++;
// //         }
// //         return count;
// //     }

// //     public static void invertNum(long n) {
// //         // if (n == 0) {
// //         //     return 0;
// //         // }
// //         long temp = n;
// //         long temp1 = n;
// //         long prevNum = 0;
// //         long factor = 1;
// //         long lastNum = 0;
// //         while (n != 0) {
// //             lastNum = n % 10;
// //             long update = 9 - lastNum;
// //             if (update < lastNum) {
// //                 lastNum = update;
// //             }
// //             prevNum += lastNum * factor;
// //             factor = factor * 10;
// //             n = n / 10;
// //         }
// //         long count = countDigit(temp);
// //         if (lastNum == 0) {
// //             long addi = 9;
// //             for (int i = 0; i < count-1; i++) {
// //                 addi = addi * 10;
// //             }
// //             prevNum = addi + prevNum;
// //         }
// //         System.out.println(prevNum);
// //         System.out.println(temp1);
// //         // if (prevNum < temp1) {
// //         //     // return prevNum;
// //         //     System.out.println(prevNum);
// //         // } else {
// //         //     // return temp1;
// //         //     System.out.println(temp1);
// //         // }

        
// //     }

// //     public static void main(String args[]) {
// //         // Scanner sc = new Scanner(System.in);
// //         // long n = sc.nextLong();
// //         // System.out.println(invertNum(999));
// //         invertNum(99199);
// //     }
// // }





























// package Week1.Assignment_1Sol;
// import java.util.*;
// public class Main {
//     public static int decimalToAnyBase(int sb, int db, int n){
//         int n1=n;
//         int prevSum=0;
//         if(sb==10){
//             int factor=1;
//             int prevDb=0;
//             int count=0;
//             while(n1!=0){
//                 int remainder=n1%db;
//                 prevSum=prevSum+remainder*factor;
//                 factor=factor*10;
//                 prevDb=n1;
//                 n1=n1/db;
//                 count++;
//             }
//             // int firstDigi=prevDb;
//             // if(prevDb!=0){
//             //     for(int j=0;j<count;j++){
//             //         firstDigi=firstDigi*10;
//             //     }
//             //     prevSum+=firstDigi;
//             // }
//             // System.out.println(prevSum);
//         }
//         return prevSum;

//     }
//     public static void anybaseToAnyBase(int sb, int db, int n){
//         int n1=n;
//         int deciSum=0;
//         int power=sb;
//         int i=0;
//         if(sb==10){
//             int decimalToAny=decimalToAnyBase(sb, db, n);
//             System.out.println(decimalToAny);
//         }
//         if(db==10){
//             while(n!=0){
//                 int lastNum=n%10;
//                 deciSum+=lastNum*Math.pow(sb,i);
//                 i++;
//                 n/=10;
//             }
//             System.out.println(deciSum);
//         }
//         // else if(sb==10){
//         //     int prevSum=0;
//         //     int factor=1;
//         //     int prevDb=0;
//         //     int count=0;
//         //     while(n1!=0){
//         //         int remainder=n1%db;
//         //         prevSum=prevSum+remainder*factor;
//         //         factor=factor*10;
//         //         prevDb=n1;
//         //         n1=n1/db;
//         //         count++;
//         //     }
//         //     int firstDigi=prevDb;
//         //     // if(prevDb!=0){
//         //     //     for(int j=0;j<count;j++){
//         //     //         firstDigi=firstDigi*10;
//         //     //     }
//         //     //     prevSum+=firstDigi;
//         //     // }
//         //     System.out.println(prevSum);
//         // }
//         else{
//             // int decimalToBinary=decimalToAnyBase(10, 2, n);
//             // while(decimalToBinary!=0){
                
//             // }
//             // int count=db%2;
//             // int prevSum=0;
//             // while(n!=0){
//             //     int lastNum=n%10;
//             //     int deciToBin=decimalToAnyBase(10, 2, lastNum);
//             //     for (int k = 0; k < count; k++) {
//             //         prevSum=prevSum+deciToBin*10;
//             //     }
                
//             // }
//         }
//     }
    
//     public static void main(String args[]) {
//         anybaseToAnyBase(10,8,10);

//     }
// }






















import java.util.*;
public class Solution {
    // you need treat n as an unsigned value
    public static long binaryToDecimal(long n){
        long sum=0;
        int power=0;
        while(n!=0){
            long lastNum=n%10;
            sum=sum+(long)(lastNum*Math.pow(2,power));
            power++;
            n=n/10;
        }
        return sum;
    }
    public static long reverseBits(long n) {
        long x=n;
        long sum=0;
        while(n!=0){
            long lastNum=n%10;
            sum=sum*10+lastNum;
            n=n/10;
        }
        long inverse=binaryToDecimal(sum);
        return inverse;
    }
    public static void main(String[] args) {
        System.out.println(reverseBits(110));
    }
}