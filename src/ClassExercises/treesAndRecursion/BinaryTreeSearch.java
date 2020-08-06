package ClassExercises.treesAndRecursion;

public class BinaryTreeSearch {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(new Integer[] {2, 85, 4, 5});
        System.out.println(binaryTree.search(4));

        // check with empty tree
        BinaryTree treeTwo = new BinaryTree(new Integer[] {});
        System.out.println(treeTwo.search(5));
    }
}
