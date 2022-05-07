package LeetCode;

public class _offer33 {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder == null || postorder.length == 0) return false;
        return verifyPostorder(postorder, 0, postorder.length);
    }
    public boolean verifyPostorder(int[] postorder, int start, int length) {
        if(length <= 1) return true;

        int root = postorder[start + length - 1];
        int i = start;
        for(;i < start + length - 1; i++)  {
            if(postorder[i] > root)
                break;
        }

        int j = i;
        for(;j < start + length -1; j++) {
            if(postorder[j] < root)
                return false;
        }

        boolean left = verifyPostorder(postorder, start, i - start);
        boolean right = verifyPostorder(postorder, i, start + length - 1 - i);

        return left&&right;
    }
}
