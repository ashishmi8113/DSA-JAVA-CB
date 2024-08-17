package Week5.Day0;

public class SuffixPrefix {
    public static int[] prefix(int[] arr){
        int[] p=new int[arr.length+1];
        p[0]=0;
        for(int i=1;i<p.length;i++){
            p[i]=arr[i-1]+p[i-1];
        }
        return p;
    }
    public static int[] suffix(int[] arr){
        int[] s=new int[arr.length+1];
        s[arr.length-1]=0;
        for(int i=s.length-2;i>=0;i--){
            s[i]=arr[i]+s[i+1];
        }
        return s;
    }
    public static int findMiddleIndex(int[] arr) {
        int[] s=suffix(arr);
        int[] p=prefix(arr);
        for(int i=0;i<p.length-1;i++){
            if(s[i+1]==p[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] p=prefix(arr);
        int[] s=suffix(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
    }
}
