class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Split the sentences into individual words
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        // Create a map to store the frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();

        // Count the frequency of words in the first sentence
        for (String word : words1) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Count the frequency of words in the second sentence
        for (String word : words2) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Create a list to store the uncommon words
        List<String> result = new ArrayList<>();

        // Find the words that have a frequency of exactly 1
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) == 1) {
                result.add(word);
            }
        }

        // Convert the result list to an array and return
        return result.toArray(new String[0]);
    }
}