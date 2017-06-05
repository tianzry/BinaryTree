/**
 * Created by tianz on 2017/6/5 0005.
 */
public class BinaryTree {
    /**
     * 树节点
     */
    class BinaryTreeNode {
        private int data;
        private BinaryTreeNode left;
        private BinaryTreeNode right;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public BinaryTreeNode getLeft() {
            return left;
        }

        public void setLeft(BinaryTreeNode left) {
            this.left = left;
        }

        public BinaryTreeNode getRight() {
            return right;
        }

        public void setRight(BinaryTreeNode right) {
            this.right = right;
        }
    }

    public void insert(BinaryTreeNode root, int data) {

    }

    public void preOrder(BinaryTreeNode root) {
        if (root != null) {
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

    }
}
