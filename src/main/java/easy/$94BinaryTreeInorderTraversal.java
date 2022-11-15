package easy;

import java.util.ArrayList;
import java.util.List;

public class $94BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        iterator(root,list);
        return list;
    }

    public void iterator(TreeNode root,List<Integer> list){
        if(root!=null){
            iterator(root.left,list);
            list.add(root.val);
            iterator(root.right,list);
        }
    }


    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.right = new TreeNode(2);
        t.left = null;
        t.right.left = null;
        t.right.right = new TreeNode(3);
        System.out.println(new $94BinaryTreeInorderTraversal().inorderTraversal(t));
    }

}
