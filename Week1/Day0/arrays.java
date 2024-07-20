package Week1.Day0;

public class arrays {

    static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void forEachLoop(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[5];
        int[] nums={1,2,3,4,5,6};
        arr=nums; //shallow copy
        // arr[0]=5;
        // arr[1]=10;
        // arr[2]=15;
        // arr[3]=20;
        // arr[4]=25;
        System.out.println(arr[3]);

        // Char Array
        char[] arr2=new char[5];
        arr2[0]=5;
        arr2[1]=10;
        arr2[2]=15;
        arr2[3]=20;
        arr2[4]=25;
        System.out.println(arr2[3]);

        forEachLoop(arr); // Printing For Each Loop Method Using For Each Loop
        System.out.println();
        System.out.println("--------------------");


        // if Number starts with 0 java consider it octal number
        // Implicitly converts octal number into decimal number
        int a=0001; // octal number
        System.out.println(a); // converts octal to decimal 
        
        System.out.println("--------------------");
        int b=0071; // octal number
        System.out.println(b); // converts octal to decimal 


    }
}
