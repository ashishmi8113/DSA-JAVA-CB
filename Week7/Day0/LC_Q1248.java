// import java.util.ArrayList;

public class LC_Q1248 {
    public static int[] prefixSum(int[] arr){
        int[] res=new int[arr.length];
        res[0]=0;
        for(int i=1;i<arr.length;i++){
            res[i]=res[i-1]+arr[i-1];
        }
        return res;
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int total=0;
        for (int i = 0; i < nums.length; i++) {
            int ans=0;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]%2!=0){
                    ans++;
                }
                if(ans==k){
                    total++;
                }
            }
        }
        return total;
    }
    

    public static void display(int[] arr){
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr1={2,2,2,1,2,2,1,2,2,2};
        int[] arr={1,1,2,1,1};
        int[] prefix=prefixSum(arr);
        display(arr);
        display(prefix);
        int ans=numberOfSubarrays(arr, 3);
        System.out.println(ans);

        System.out.println();
        
        int[] prefix1=prefixSum(arr1);
        display(arr1);
        display(prefix1);
        int ans1=numberOfSubarrays(arr1, 2);
        System.out.println(ans1);
    }
}
