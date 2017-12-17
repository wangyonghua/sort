package com.binary_tree;

/**
 * 求2个节点的最近公共祖先节点
 *
 * @author fxx
 */
public class LowestAncestor {

    /*求解n1和n1的最近公共祖先
     * 
     * 利用后序遍历求解
     */
    public Node getLowestAncestor(Node head, Node n1, Node n2) {
        if (head == null || head == n1 || head == n2) {
            return head;
        }

        //先遍历左右子树，左右子树的返回为left和right；然后判断left和right请情况
        Node left = getLowestAncestor(head.left, n1, n2);
        Node right = getLowestAncestor(head.right, n1, n2);


        /*左和右都不为null---说明在左子树中发现过n1或n2，
         * 在右子树上也发现过n1或n2，并且n1和n2在当前节点首次相遇
         */
        if (left != null && right != null) {
            return head;
        }

        /*左和右中一个不为null，另一个为null，
         * 说明不为null的节点是n1或n2中的一个，或者是n1和n2的最近祖先；
         * 直接返回；
         */
        if (left != null) {
            return left;
        }
        if (right != null) {
            return right;
        }

        //左和右均为null，没有发现n1和n2；
        return null;
    }

    public static void main(String[] args) {
        Node node = new Node(7);
        Node node1 = new Node(8);
        Node node2 = new Node(9);
        Node node3 = new Node(10);
        Node node4 = new Node(11);
        Node node5 = new Node(12);
        Node node6 = new Node(13);
        Node node7 = new Node(14);
        node.left = node1;
        node1.left = node2;
        node1.right = node3;

        node.right = node4;
        node4.right = node6;
        node4.left = node5;
        node5.left = node7;

        LowestAncestor lowestAncestor = new LowestAncestor();
        Node lowestAncestor1 = lowestAncestor.getLowestAncestor(node, node3, node5);
        System.out.println(lowestAncestor1.value);
    }
}