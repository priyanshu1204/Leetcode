// Using a Pair (List of Pairs)

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<Pair> people = new ArrayList<>();
        int N = names.length;

        // Store pairs of heights and names
        for (int i = 0; i < N; i++) {
            people.add(new Pair(heights[i], names[i]));
        }

        // Sort the list in descending order by height
        people.sort((a, b) -> Integer.compare(b.height, a.height));

        // Modify the names array with the sorted order
        for (int i = 0; i < N; i++) {
            names[i] = people.get(i).name;
        }

        return names;
    }

    // Custom Pair class to hold height and name
    class Pair {
        int height;
        String name;

        Pair(int h, String n) {
            height = h;
            name = n;
        }
    }
}