//apna college solution
import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int n = grid.length;
        int repeatedValue = 0, missingValue;
        int expectedSum = 0, actualSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                actualSum += grid[i][j];
                if (set.contains(grid[i][j])) {
                    repeatedValue = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }
            }
        }

        expectedSum = (n * n) * (n * n + 1) / 2;
        missingValue = expectedSum + repeatedValue - actualSum;
        ans.add(repeatedValue);
        ans.add(missingValue);

        // Convert the list to an array and return
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
