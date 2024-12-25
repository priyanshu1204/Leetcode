class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        ArrayList<int[]> newIntervals = new ArrayList<int[]>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i=0; i<intervals.length; i++)
        {
            start = intervals[i][0];
            end = intervals[i][1];
            for(int j=i+1; j<intervals.length; j++)
            {
                if (intervals[j][0] > end)
                {
                    int[] newInterval = {start, end};
                    newIntervals.add(newInterval);
                    break;
                }
                else
                {
                    end = Math.max(end, intervals[j][1]);
                    i++;
                }
            }
        }

        int[] finalInterval = {start, end};
        newIntervals.add(finalInterval);

        return convertToArray(newIntervals);
    }

    public int[][] convertToArray(List<int[]> items)
    {
        int[][] result = new int[items.size()][];
        for(int i=0; i<items.size(); i++)
        {
            result[i] = items.get(i);
        }
        return result;
    }
}