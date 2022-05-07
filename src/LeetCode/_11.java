package LeetCode;

public class _11 {
    public static int minArray(int[] numbers) {
        int start  = 0;
        int end = numbers.length - 1;
        if(numbers[start] < numbers[end]) {
            return numbers[start];
        }
        while ((start + 1) != end) {
            int mid = (start + end) / 2;
            if(numbers[mid] >= numbers[start]) {
                start = mid;
            }else {
                end = mid;
            }
        }
        return numbers[end];
    }

    public static void main(String[] args) {
        int[] arr = {1};
        int a = minArray(arr);
        System.out.println(a);
    }
}
