// We traverse diagonal by diagonal.
// Each diagonal is identified by the sum of indices i + j.

// If i + j is even, we move up-right.
// If i + j is odd, we move down-left.

// Make sure we stay inside the matrix bounds.
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];

        int r = 0, c = 0, dir = 1; // dir=1 means up-right, dir=-1 means down-left

        for (int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];

            if (dir == 1) { // moving up-right
                if (c == n - 1) {      // hit right boundary
                    r++;
                    dir = -1;
                } else if (r == 0) {   // hit top boundary
                    c++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }
            } else { // moving down-left
                if (r == m - 1) {      // hit bottom boundary
                    c++;
                    dir = 1;
                } else if (c == 0) {   // hit left boundary
                    r++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
        }

        return result;
    }
}
