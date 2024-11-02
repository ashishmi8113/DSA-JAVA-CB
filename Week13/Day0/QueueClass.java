package Week13.Day0;

public class QueueClass {
    private int[] arr;
    private int size=0;
    private int front=0;

    public QueueClass(){
        arr=new int[5];
    }
    public QueueClass(int n){
        arr=new int[n];
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public void enQueue(int data){
        int ptr=(front+size)%arr.length;
        arr[ptr]=data;
        size++;
    }
    public int deQueue(){
        int rv=arr[front];
        front=(front+1)%arr.length;
        size--;
        return rv;
    }
    public int get(){
        return arr[front];
    }
    public int size(){
        return size;
    }
    public void display(){
        for (int i = (front)%(arr.length-1); i <size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
