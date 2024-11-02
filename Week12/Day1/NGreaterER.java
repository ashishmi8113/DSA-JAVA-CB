package Week12.Day1;

import java.util.*;

public class NGreaterER {

    public static int[] nextGreaterElementRight(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> stk=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stk.empty() && arr[i]>arr[stk.peek()]) {
                ans[stk.pop()]=arr[i];
            }
            stk.push(i);
        }
        while(!stk.empty()){
            ans[stk.pop()]=-1;
        }
        return ans;

    }
    public static int[] nextSmallerElementRight(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> stk=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stk.empty() && arr[i]<arr[stk.peek()]) {
                ans[stk.pop()]=arr[i];
            }
            stk.push(i);
        }
        while(!stk.empty()){
            ans[stk.pop()]=-1;
        }
        return ans;

    }
    public static int[] nextSmallerElementLeft(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> stk=new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {
            while (!stk.empty() && arr[i]<arr[stk.peek()]) {
                ans[stk.pop()]=arr[i];
            }
            stk.push(i);
        }
        while(!stk.empty()){
            ans[stk.pop()]=-1;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,2,5};
        int[] ans=nextGreaterElementRight(arr);
        int[] ans2=nextSmallerElementRight(arr);
        int[] ans3=nextSmallerElementLeft(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans2[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans3[i]+"\t");
        }
        
    }
}
