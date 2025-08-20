class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // move left forward until vowel
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }
            // move right backward until vowel
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }
            // swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}