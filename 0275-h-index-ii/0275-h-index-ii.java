class Solution {
    public int hIndex(int[] citations) {
         int n = citations.length;
        int left = 0, right = n - 1;
        
        // Binary search for the leftmost position where citations[i] >= (n-i)
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int papersFromMid = n - mid;  // Number of papers from mid to end
            
            if (citations[mid] >= papersFromMid) {
                // Current position gives us a valid H-index of 'papersFromMid'
                // But there might be a better (higher) H-index to the left
                right = mid - 1;
            } else {
                // Current citations are too low for required H-index
                // Search in the right half (higher citations)
                left = mid + 1;
            }
        }
        
        // After binary search, 'left' points to the first valid position
        // H-index = number of papers from that position to end = n - left
        return n - left;
    }








    //     // Step 1: Sort the array in ascending order
    //     Arrays.sort(citations);
    //     int n = citations.length;
        
    //     // Step 2: Iterate through sorted array
    //     for (int i = 0; i < n; i++) {
    //         // Step 3: Calculate how many papers are from current position to end
    //         int papersFromHere = n - i;
            
    //         // Step 4: Check if current citation count >= papers from here
    //         // This means we have 'papersFromHere' papers with >= 'papersFromHere' citations
    //         if (citations[i] >= papersFromHere) {
    //             return papersFromHere;
    //         }
    //     }
        
    //     // Step 5: If no valid H-index found, return 0
    //     return 0;
        
    // }
}