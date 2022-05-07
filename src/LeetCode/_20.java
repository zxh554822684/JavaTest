package LeetCode;

public class _20 {
    int index = 0;
    public boolean isNumber(String s) {
        if(s == "") return false;
       // 添加结束标志
        s = s + '/';
        char[] chars = s.toCharArray();
        boolean flag = IsInteger(chars);
        if(chars[index] == '.') {
            index++;
          // 小数点前可以没整数，小数点后也可以没有整数
            flag = IsUnsigInteger(chars) || flag;
        }
        if(chars[index] == 'e' || chars[index] == 'E') {
            index++;
            // 指数前必须有整数，指数后必须有整数
            flag = IsInteger(chars) && flag;
        }
        return flag && chars[index] == '/';
    }

    public boolean IsInteger(char[] chars) {
        if(chars[index] == '+' || chars[index] == '-') index++;
        return IsUnsigInteger(chars);
    }


    public boolean IsUnsigInteger(char[] chars) {
        int temp = index;
        while(chars[index] != '/' && chars[index] >= '0' && chars[index] <= '9') {
            index++;
        }
        return index > temp;
    }
}
