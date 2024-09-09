package Week8.OOpsClass;

public class home {
    public static void main(String[] args) {
        cat c1=new cat();
        cat c2=new cat("cat1","red","cat ki Prajati");
        c2.callCat();
        c2.getter();

        c1.callCat();
        c1.getter();

    }
}
