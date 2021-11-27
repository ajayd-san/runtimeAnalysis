package Algorithms;

public class BinaryTree {
    private static Node root;
    private static int index = 0;

    private static class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int val){
            this.value = val;
        }
    }

    private static Node add(Node root, int val){
        if (root == null) return new Node(val);
        else if (root.value < val) root.right = add(root.right, val);
        else root.left = add(root.left, val);

        return root;
    }

    private static void add_nodes(int[] arr){
        for (int num : arr)
            root = add(root, num);
    }

    private static void inorder(Node root, int[] arr){
        if (root == null) return;
        inorder(root.left, arr);
        arr[index++] = root.value;
        inorder(root.right, arr);
    }

    public static int[] bstSort(int[] arr){
        add_nodes(arr);
        inorder(root, arr);

        //** resetting index and root since they are static to avoid exceptions.
        index = 0;
        root = null;
        return arr;
    }
}
