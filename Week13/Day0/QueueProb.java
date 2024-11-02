package Week13.Day0;

public class QueueProb {
    public static void main(String[] args) {
        QueueClass q=new QueueClass();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.deQueue();
        q.enQueue(4);
        q.enQueue(5);
        q.deQueue();
        q.deQueue();
        q.enQueue(10);
        q.enQueue(11);
        q.enQueue(12);
        System.out.println(q.get());

        q.display();
    }

    QueueUsingStack stkQ=new QueueUsingStack();
    
}
