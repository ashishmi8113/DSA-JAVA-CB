package Week12.Day1;

import java.util.*;

public class stkPushRecur {

    public static void reverseStack(Stack<Integer> stk){
        if(stk.empty()){
            return;
        }
        int x=stk.pop();
        reverseStack(stk);
        addFirst(stk, x);
    }

    public static void addFirst(Stack<Integer> stk, int item){
        if(stk.empty()){
            stk.push(item);
            return;
        }
        int x=stk.pop();
        addFirst(stk, item);
        stk.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        addFirst(stk, 100);
        System.out.print(stk);
        reverseStack(stk);
        System.out.print(stk);
    }
}
