package Week1;

import java.util.*;
public class AssignMent_1Sol {
    public static void sumEvenOddPlaces(int n){
        int evenSum=0;
        int oddSum=0;
        while(n!=0){
            int lastNumOdd=n%10;
            oddSum+=lastNumOdd;
            n=n/10;
            int lastNumEven=n%10;
            evenSum+=lastNumEven;
            n=n/10;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }

    public static int q2(int n,int a){
        int count=0;
        while(n!=0){
            int lastnum=n%10;
            if(lastnum==a){
                count++;
            }
            n=n/10;
        }
        return count;
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



    public static int q4(int n){
        double sum=0;
        int power=0;
        while(n!=0){
            int lastnum=n%10;
            double powerTwo=Math.pow(2, power);
            power++;
            sum=sum+lastnum*powerTwo;
            n=n/10;
        }
        return (int)sum;
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



    public static int fibbo(int n){
        int a=0;
        int b=1;
        int c=a+b;
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            for(int i=2;i<n;i++){
                a=b;
                b=c;
                c=a+b;
            }
            return c;
        }
    }


    public static void q7(int min, int max, int step){
        for (int i = min; i <=max; i=i+step) {
            double c=(5.0/9.0)*(i-32);
            System.out.println(i+" "+(int)c);
        }
    }




     public static int q8(int n){
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

        int indexarr=0;
        for (int i = count-1; i >=0; i--) {
            int index = arr[i];
            if (index >=0 && index <=count) {
                arr2[count-index] = indexarr+1;
                indexarr++;
            }
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
        return sum;
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








    public static long countDigit(long n){
            int count=0;
            while(n!=0){
                n=n/10;
                count++;
            }
            return count;
    }
    
    public static long invertNum(long n){
        if (n == 0) {
            return 0;
        }
        long count=countDigit(n);
        long temp=n;
        long prevNum=0;
        long factor=1;
        long lastNum=0;
        while(n!=0){
            lastNum =n%10;
            long update=9-lastNum;
            if(update<lastNum){
                lastNum=update;
            }
            prevNum+=lastNum*factor;
            factor=factor*10;
            n=n/10;
        } 
        if(lastNum==0){
            long factor2=9;
            for(int i=0;i<count-1;i++){
                factor2=factor2*10;
            }
            prevNum=factor2+prevNum;
        }
        if(prevNum<temp){
            return prevNum;
        }
        else {
            return temp;
        }
            
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




















    public static int decimalToAnyBase(int sb, int db, int n){
        int n1=n;
        int prevSum=0;
        if(sb==10){
            int factor=1;
            // int prevDb=0;
            // int count=0;
            while(n1!=0){
                int remainder=n1%db;
                prevSum=prevSum+remainder*factor;
                factor=factor*10;
                // prevDb=n1;
                n1=n1/db;
                // count++;
            }
        }
        return prevSum;

    }
    
    public static int anyBaseToDecimal(int sb, int db , int n){
        // int n1=n;
        int deciSum=0;
        // int power=sb;
        int i=0;
        if(db==10){
            while(n!=0){
                int lastNum=n%10;
                deciSum+=lastNum*Math.pow(sb,i);
                i++;
                n/=10;
            }
        }
        return deciSum;
    }
    public static void anybaseToAnyBase(int sb, int db, int n){
        int anyToDeci=anyBaseToDecimal(sb,10,n);
        int deciToAny=decimalToAnyBase(10,db,anyToDeci);
        System.out.println(deciToAny);
    }
    



















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





    public static void purchase(int m, int n){
        int ayushPurchase=0;
        int harshitPurchase=1;
        if(m==0){
            System.out.println("Harshit");
        }
        if(n==0){
            System.out.println("Aayush");
        }
        int a=0;
        int h=0;
        while(ayushPurchase<=m){
            ayushPurchase=2*a+1;
            a++;
        }
        while(harshitPurchase<=n){
            harshitPurchase=2*h;
            h++;
        }
        if(ayushPurchase>harshitPurchase){
            System.out.println("Aayush");
        }
        else{
            System.out.println("Harshit");
        }
    }









    public static void oddEvenScheme(int num){
        // for(int i=0;i<n;i++){
            // int num2=num;
            int evenNum=0;
            int oddNum=0;
            while(num!=0){
                int lastNum=num%10;
                if(lastNum%2==0){
                    evenNum+=lastNum;
                }
                else{
                    oddNum+=lastNum;
                }
                num=num/10;
            }
            if(evenNum%4==0 || oddNum%3==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        // }
    }












    public static boolean isArmStrong(int n){
        int count=0;
        int temp1=n;
        int temp2=n;
        while(temp1!=0){
            temp1=temp1/10;
            count++;
        }
        int sum=0;
        while(n!=0){
            int lastNum= n%10;
            int multiply=1;
            for(int i=0;i<count;i++){
                multiply=multiply*lastNum;
            }
            sum+=multiply;
            n=n/10;
        }
        if(sum==temp2){
            return true;
        }
        return false;
    }

















    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        // // SIMPLE INPUT QUESTION
        // int prevSum=0;
        // while(sc.hasNextInt()){
        //     int n=sc.nextInt();
        //     prevSum+=n;
        //     if(prevSum<0)
        //         break;
        //     else{
        //         System.out.println(n);
        //     }
        // }


        // anybaseToAnyBase(10, 2, 8);
        System.out.println(invertNum(9999));
        sc.close();
    }
}