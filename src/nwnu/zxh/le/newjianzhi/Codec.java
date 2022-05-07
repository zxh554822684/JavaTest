package nwnu.zxh.le.newjianzhi;

import LeetCode.Test.Test;
import LeetCode.Utils.TreeNode;

import java.util.*;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "null";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right); 
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if("".equals(data)) return null;
        String[] vals = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(vals));
        return deserialize(queue);
    }
    public TreeNode deserialize(Queue<String> queue) {
        String s = queue.remove();
        if(s.equals("null")) return null;
        TreeNode root = new TreeNode(Integer.valueOf(s));
        root.left = deserialize(queue);
        root.right = deserialize(queue);
        return root;
    }

    public static void main(String[] args) {
        System.out.println(Math.round(-11.5));
    }
    public static void test(List<String> a) {
        a = new ArrayList<String>();
        a.add("abvc");
    }
}