public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Tree tree = new Tree(7);

        tree.add(6);
        tree.add(3);
        tree.add(9);
        tree.add(14);
        //tree.add(5);
        tree.traverse(tree);
        System.out.println("XX");
        tree = tree.delete(6);
        tree.traverse(tree);

    }
}
