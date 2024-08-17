import java.util.Arrays;

public class LC_1552_Balls {
    public static boolean check(int mid,int balls, int[] arr){
        // int tempBalls=0;
        // for (int i = 0; i < arr.length; i=i+mid) {
        //     tempBalls++;
        // }
        // if(tempBalls<balls){
        //     return false;
        // }
        // return true;
        int tempBalls=1;
        int lastpos=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-lastpos>=mid){
                lastpos=arr[i];
                tempBalls++;
            }
        }
        return (tempBalls>=balls);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7};
        Arrays.sort(arr);
        int m=3;
        int low=1;
        int high=arr[arr.length-1]-arr[0];
        int ans=1;
        while(low<=high){
            int mid=high-(high-low)/2;
            if(check(mid,m,arr)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid+1;
            }
        }
        System.out.println(ans);
    }
}
