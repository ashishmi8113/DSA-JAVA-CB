package Week12.Day1;


import java.util.Stack;

public class StackProb {



    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<5;i++){
            stk.push(i+1);
        }
        
        Stack<Integer> stk2=new Stack<>();
        while(!stk.empty()){
            stk2.push(stk.pop());
        }

        stk.push(100);
        while (!stk2.empty()) {
            stk.push(stk2.pop());
        }

        while(!stk.empty()) {
            System.out.println(stk.pop());
        }

    }
}
