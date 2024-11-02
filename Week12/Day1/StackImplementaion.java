package Week12.Day1;

public class StackImplementaion {
    public static void main(String[] args) {
        StackClass stkc=new StackClass();
        // stkc.push(5);
        // stkc.push(10);
        // stkc.push(15);
        // stkc.push(20);
        System.out.println(stkc.pop());
        stkc.printStack();
        System.out.println(stkc.peek());
        System.out.println(stkc.sizeStack());
        System.out.println(stkc.isEmpty());
    }
}
