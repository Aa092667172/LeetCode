package easy;

import java.util.Stack;

public class $101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return look(root.left,root.right);
    }

    public boolean look(TreeNode left,TreeNode right){
        //假設其中一個不為null 回傳兩邊樹是否相同
        if(left==null||right==null)
            return left==right;
        //兩邊值不相等 直接回傳失敗
        if(left.val!=right.val)
            return false;
        //需左右遞迴兩邊皆相等
        return look(left.left,right.right) && look(right.left,left.right);
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2,new TreeNode(3),new TreeNode(4)), new TreeNode(2,new TreeNode(4),new TreeNode(3)));
        System.out.println(new $101SymmetricTree().isSymmetric(treeNode));
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}