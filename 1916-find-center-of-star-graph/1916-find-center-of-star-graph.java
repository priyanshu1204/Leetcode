class Solution {
    public int findCenter(int[][] edges) {
        // The center of the star graph is the node that appears in both edges[0] and edges[1].
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        } else {
            return edges[0][1];
        }
    }
}