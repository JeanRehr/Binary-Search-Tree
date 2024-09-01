public class Main {
    public static void main(String[] args) {
        BTree tree = new BTree();
        /*
        tree.insert(11);
        tree.insert(12);
        tree.insert(28);
        tree.insert(20);
        tree.insert(5);
        tree.insert(10);
        tree.insert(1);
        tree.insert(8);
        tree.insert(2);
        tree.insert(7);
        */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);


        tree.inorder();
        System.out.println();
        tree.postorder();
        System.out.println();
        System.out.println("preorder");
        tree.preorder();
        System.out.println();
        tree.printTree();
        System.out.println();

        System.out.println(tree.getDepth());
    }
}