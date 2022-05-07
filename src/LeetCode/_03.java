package LeetCode;

public class _03 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int row = 0;
        int columns = matrix[0].length;
        while(columns >0 && row < matrix.length) {
            if(matrix[row][columns - 1] == target) {
                return true;
            }else if(matrix[row][columns - 1] > target){
                columns--;
            }else{
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
          };
        System.out.println(findNumberIn2DArray(arr,20));
    }
}
