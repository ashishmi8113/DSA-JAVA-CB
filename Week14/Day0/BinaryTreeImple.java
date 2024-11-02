package Week14.Day0;

public class BinaryTreeImple {
    public static void main(String[] args) {
        
        BinaryTreeClass bt=new BinaryTreeClass();
        System.out.println(bt.maxValue());

        System.out.println(bt.isPresent(bt.root, 5));

        System.out.println(bt.height(bt.root));
        System.out.println();

        bt.prefix(bt.root);System.out.println();
        bt.infix(bt.root);System.out.println();
        bt.postfix(bt.root);System.out.println();
    }
}
