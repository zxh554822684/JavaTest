package LeetCode;

public class _13 {
    public int movingCount(int m, int n, int k) {
        if(m <= 0 || n <= 0 || k < 0) {
            return 0;
        }
        // false代表未访问过
        boolean[] res = new boolean[m * n];
        for(int i = 0; i < m*n; i++) {
            res[i] = false;
        }
        int count = robotDFS(k, m, n, 0, 0, res);
        return count;
    }
    public int robotDFS(int k, int m, int n, int row, int col, boolean[] res) {
        int count = 0;
        if(check(k, m, n, row, col, res)) {
            res[row * n + col] = true;
            count = 1 + robotDFS(k, m, n, row + 1, col, res) +
                    robotDFS(k, m, n, row - 1, col, res) +
                    robotDFS(k, m, n, row, col + 1, res) +
                    robotDFS(k, m, n, row, col - 1, res);
        }
        return count;
    }
    public boolean check(int k, int m, int n, int row, int col, boolean[] res) {
        if(row < 0 || col < 0 || row >= m || col >= n || digitsSum(row, col, k) ||
                res[row * n + col]) {
            return false;
        }
        return true;
    }

    public boolean digitsSum(int row, int col, int k) {
        int rowGeWei = row % 10;
        int rowShiWei = row / 10;
        int colGeWei = col % 10;
        int colShiWei = col / 10;
        if((rowGeWei + rowShiWei + colGeWei + colShiWei) > k) {
            return true;
        }
        return false;
    }
}
