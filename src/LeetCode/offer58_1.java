package LeetCode;

public class offer58_1 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        revers(chars, left, right);
        left = right = 0;
        for(int i = 0; i < chars.length; i++) {
            if(chars[left] == ' ') {
                left++;
                right++;
            }else if(chars[right] == ' ' || right == chars.length) {
                revers(chars, left, right);
                left = ++right;
            }else {
                right++;
            }
        }
        return new String(chars);
    }
    public void revers(char[] chars, int left, int right) {
        while(left < right) {
            char tempChar = chars[left];
            chars[left] = chars[right];
            chars[right] = tempChar;
        }
    }
}
