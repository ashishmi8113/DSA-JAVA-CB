package Week3.Day0;




// //                                       M Y     W A Y
// class RotateArr {
//     public static int minimum(int[] arr){
//         int min=0;
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]<arr[min]){
//                 min=i;
//             }
//         }
//         return min;
//     }
//     public static int maximum(int[] arr, int min){
//         int max=min+1;
//         for(int i=min;i<arr.length;i++){
//             if(arr[i]>arr[max]){
//                 max=i;
//             }
//         }
//         return max;
//     }
//     public static int maxProfit(int[] arr) {
//         int min=minimum(arr);
//         int max=maximum(arr,min);
//         return max-min;
//     }
    
// }

























// //                                   B E T T E R    W A Y

// public class Stocks {
//     public static int[] NGER(int[] arr){
//         int maxElement=0;
//         int[] nger=new int[arr.length];
//         for (int i = arr.length-1; i >=0; i--) {
//             nger[i]=maxElement;
//             maxElement=Math.max(maxElement,arr[i]);
//         }
//         return nger;
//     }
//     public static void main(String[] args) {
//         int[] arr={7,1,5,3,6,4};
//         int[] res=NGER(arr);
//         int maxp=0;
//         int currp=0;
//         for (int i = 0; i < res.length; i++) {
//             currp=res[i]-arr[i];
//             maxp=Math.max(maxp,currp);
//         }
//         System.out.println(maxp);
//     }
// }










// //                                   O P T I M A L    W A Y
// package Week3.Day0;

// public class Stocks {
//     public static void main(String[] args) {
//         int[] arr={7,1,5,3,6,4};
//         int maxp=0;
//         int currp=0;
//         int buyAt=arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if(buyAt>arr[i]){
//                 buyAt=arr[i];

//             }
//             else{
//                 currp=arr[i]-buyAt;
//                 maxp=Math.max(maxp,currp);
//             }
//         }
//         System.out.println(maxp);
//     }
// }
