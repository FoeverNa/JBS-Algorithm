package datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

class NodeBinaryTree {
    private final Node root;
    private boolean isFound;

    public NodeBinaryTree(int[] array) {
        Node[] nodeArray = new Node[array.length];
        for (int i = 0; i < array.length; i++) {
            nodeArray[i] = new Node(array[i], null, null);
        }

        for (int i = 0; i < array.length; i++) {
            int left = i * 2 + 1;
            int right = i * 2 + 2;

            if (left < array.length) {
                nodeArray[i].left = nodeArray[left];
            }
            if (right < array.length) {
                nodeArray[i].right = nodeArray[right];
            }
        }
        root = nodeArray[0];
    }

    public void preorder() {
        preorderHelper(root);
        System.out.println(" ");
    }

    private void preorderHelper(Node node) {
        System.out.print(node.value + " ");

        if (node.left != null) {
            preorderHelper(node.left);
        }
        if (node.right != null) {
            preorderHelper(node.right);
        }

    }


    public void inorder() {
        inorderHelper(root);
        System.out.println(" ");

    }

    private void inorderHelper(Node node) {

        if (node.left != null) {
            inorderHelper(node.left);
        }
        System.out.print(node.value + " ");
        if (node.right != null) {
            inorderHelper(node.right);
        }
    }

    public void postorder() {
        postorderHelper(root);
        System.out.println(" ");

    }

    private void postorderHelper(Node node) {

        if (node.left != null) {
            postorderHelper(node.left);
        }
        if (node.right != null) {
            postorderHelper(node.right);
        }
        System.out.print(node.value + " ");

    }


    public boolean bfs(int value) {
        isFound = false;
        Queue<Node> queue = new LinkedList<>();

        Node temp = root;
        while (temp != null) {
            if (temp.value == value) {
                isFound = true;
                break;
            }

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }

            if (queue.size() != 0) {
                temp = queue.poll();
            } else {
                temp = null;
            }
        }
        return isFound;
    }


    public boolean dfs(int value) {
        isFound = false;
        dfsHelper(root, value);


        return isFound;
    }

    private void dfsHelper(Node node, int value) {
        if (isFound) {
            return;
        }
        if (node.value == value) {
            isFound = true;
            return;
        }

        if (node.left != null) {
            dfsHelper(node.left, value);
        }
        if (node.right != null) {
            dfsHelper(node.right, value);
        }

    }
}

class NodeBinaryTreeTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        NodeBinaryTree tree = new NodeBinaryTree(array);

        tree.preorder();
        tree.inorder();
        tree.postorder();

        System.out.println(tree.bfs(2));
        System.out.println(tree.bfs(13));

        System.out.println(tree.dfs(5));
        System.out.println(tree.dfs(14));
    }
}

