package Week3.Day0;

//                                        B R U T E     F O R C E
// public class RotateArr {
//     public static void shift(int[] arr){
//         int n=arr.length;
//         int temp=arr[n-1];
//         for (int i = n-1; i >0; i--) {
//             arr[i]=arr[i-1];
//         }
            
//         arr[0]=temp;
//     }
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5,6,7};
//         int k=3;
//         for (int i = 0; i < k; i++) {
//             shift(arr);
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }























// //                                   B E T T E R     W A Y
// package Week3.Day0;

// public class RotateArr {
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5,6,7};
//         int n=arr.length;
//         int[] temp=new int[n];
//         int k=3;
//         for (int i = 0; i < n-k; i++) {
//             temp[i+k]=arr[i];
//         }
//         for (int i = 0; i <k; i++) {
//             temp[i]=arr[n-k+i];
//         }
//         for (int i = 0; i < temp.length; i++) {
//             arr[i]=temp[i];
//         }
//         for (int i = 0; i < temp.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



















// //                                  O P T I M A L      W A Y

public class RotateArr {
    public static void reverse(int[] arr, int a, int b){
        int s=a;
        int e=b;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }        
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=2;
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k,n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}












