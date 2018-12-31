import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BDFS {

    public static void BFS(TreeNode rootNode) {
        Queue<TreeNode> queue = new LinkedList<>();
        ((LinkedList<TreeNode>) queue).add(rootNode);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.data);
            ((LinkedList<TreeNode>) queue).add(node.leftNode);
            ((LinkedList<TreeNode>) queue).add(node.rightNode);
        }
    }

    public static void DFS(TreeNode rootNode) {
        System.out.println(rootNode.data);
        if (rootNode.leftNode != null) {
            DFS(rootNode.leftNode);
        }
        if (rootNode.rightNode != null) {
            DFS(rootNode.rightNode);
        }
    }

    public static void main(String[] args) {
        TreeNode head=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode three=new TreeNode(3);
        TreeNode four=new TreeNode(4);
        TreeNode five=new TreeNode(5);
        TreeNode six=new TreeNode(6);
        TreeNode seven=new TreeNode(7);
        head.rightNode=three;
        head.leftNode=second;
        second.rightNode=five;
        second.leftNode=four;
        three.rightNode=seven;
        three.leftNode=six;

        DFS(head);
    }




}
class TreeNode {
    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode(int data, TreeNode leftNode, TreeNode rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
}