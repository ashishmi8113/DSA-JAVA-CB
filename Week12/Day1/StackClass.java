package Week12.Day1;



public class StackClass {
    class Node{
        int val;
        Node next;

        public Node(){}

        public Node(int x){
            this.val=x;
            this.next=null;
        }
    }

    private Node head=null;
    private int size=0;

    public int sizeStack(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }
    
    public void push(int x){
        Node n1=new Node(x);
        if(head!=null){
            n1.next=head;
            head=n1;
        }
        else{
            head=n1;
            n1.next=null;
        }
        size++;
    }

    public int pop(){
        int data=-1;
        if(head!=null){
            Node temp=head;
            data=temp.val;
            head=head.next;
            temp.next=null;
            size--;
            return data;
        }
        return data;
    }

    public int peek(){
        if(head==null){
            return -1;
        }
        else{
            return head.val;
        }
    }
    public void printStack(){
        if(head!=null){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+"\t");
                temp=temp.next;
            }
        }
        else{
            System.out.println("Stack is Empty !!!");
        }
        System.out.println();
    }
    
}
