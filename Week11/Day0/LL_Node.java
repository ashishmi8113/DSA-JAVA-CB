package Week11.Day0;

public class LL_Node {
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int item){
        Node nn=new Node();
        nn.data=item;
        if(size==0){
            head=nn;
            tail=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

    public void addLast(int item){
        if(size==0){
            addFirst(item);
        }
        else{
            Node nn= new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }

    public void addBetween(int item, int posi){
        if(posi==0){
            addFirst(item);
        }
        else{
            if(posi==size+1){
                addLast(item);
            }
            else if(posi>size+1 || posi<0){
                System.out.println("INVALID POSITION !!!");
            }
            else{
                Node nn=new Node();
                nn.data=item;
                Node temp=getKthNode(posi-1);
                nn.next=temp.next;
                temp.next=nn;
                size++;
            }
        }
    }

    public Node getKthNode(int k){
        Node temp=head;
        for (int i = 0; i < k; i++) {
            temp=temp.next;
        }
        return temp;
    }

    public int getFirst(){
        return head.data;
    }
    public int getLast(){
        return tail.data;
    }
    public int getIndexNode(int k){
        if(k==0){
            return getFirst();
        }
        else if(k==size){
            return getLast();
        }
        else if(k<0 || k>size){
            return -1;
        }
        else{
            return getKthNode(k).data;
        }
    }

    public int removeLast(){
        int rv=tail.data;
        if(size==1){
            head.next=null;
            tail.next=null;
        }
        else{
            Node temp=getKthNode(size-2);
            temp.next=null;
            tail=temp;
        }
        size--;
        return rv;
    }

}
