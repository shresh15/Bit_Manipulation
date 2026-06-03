class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // Start with the first interval
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            // If intervals overlap
            if (next[0] <= current[1]) {
                // merge them
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap → add current to result
                result.add(current);
                current = next; // Move to next interval
            }
        }

        // Add the last interval
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }
}
