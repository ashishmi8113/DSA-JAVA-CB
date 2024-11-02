package Week13.Day0;

import java.util.*;

public class QueueUsingStack {
    private Stack<Integer> stk;

    public QueueUsingStack(){
        stk =new Stack<>();
    }
    public void enQueue(int item){
        if(stk.empty()){
            stk.push(item);
            return;
        }
        int x=stk.pop();
        enQueue(item);
        stk.push(x);
    }

    public int deQueue(){
        int x=stk.pop();
        return x;
    }
    public int size(){
        return stk.size();
    }

    public void display(){

    }




    
}
