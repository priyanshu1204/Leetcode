class Solution {
    public int minimumCardPickup(int[] cards) {
      Map<Integer, Integer> lastSeen = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        
        for (int i = 0; i < cards.length; i++) {
            int card = cards[i];
            
            if (lastSeen.containsKey(card)) {
                int distance = i - lastSeen.get(card) + 1;
                minDistance = Math.min(minDistance, distance);
                
                // Early termination: minimum possible distance is 2
                if (minDistance == 2) {
                    return 2;
                }
            }
            
            lastSeen.put(card, i);
        }
        
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}