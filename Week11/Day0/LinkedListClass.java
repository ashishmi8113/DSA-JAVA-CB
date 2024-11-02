package Week11.Day0;

public class LinkedListClass {
    class Node{

    }
    public static void main(String[] args) {
        LL_Node n1=new LL_Node();
        n1.addFirst(40);
        n1.addFirst(30);
        n1.addFirst(10);
        n1.addLast(100);
        n1.addBetween(200, 1);
        // Week11.Day0.LL_Node.Node temp=n1.getKthNode(2);
        // System.out.println(temp.data);
        n1.display();
        System.out.println();
        // System.out.println(n1.getFirst());
        // System.out.println(n1.getLast());
        // System.out.println(n1.getIndexNode(5));
        // System.out.println(n1.getIndexNode(6));
        System.out.println(n1.removeLast());
        n1.display();
    }
}
