package Week3.Day0;

public class KadaneAlgo {
    public static int maxSubArray(int[] arr) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxSum=Math.max(maxSum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={-1,2,5,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
