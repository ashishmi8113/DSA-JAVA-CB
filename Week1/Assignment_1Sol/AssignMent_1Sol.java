package Week1.Assignment_1Sol;

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

 
    






















    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter :=");
        int n=sc.nextInt();
        sumEvenOddPlaces(n);
        sc.close();
    }
}