package LeetCode;

import LeetCode.Utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class offer37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "[]";
        StringBuffer sb = new StringBuffer("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode temNode = queue.remove();
            if(temNode != null) {
                sb.append(Integer.toString(temNode.val)).append(",");
                queue.add(temNode.left);
                queue.add(temNode.right);
            }
            else sb.append("null").append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");
        int index = 0;
        TreeNode rootNode = new TreeNode(Integer.valueOf(vals[index++]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(rootNode);
        while(!queue.isEmpty()) {
            TreeNode temNode = queue.remove();
            if(!vals[index].equals("null")) {
                temNode.left = new TreeNode(Integer.valueOf(vals[index]));
                queue.add(temNode.left);
            }
            index++;
            if(!vals[index].equals("null")) {
                temNode.right = new TreeNode(Integer.valueOf(vals[index]));
                queue.add(temNode.right);
            }
            index++;
        }
        return rootNode;
    }
}
