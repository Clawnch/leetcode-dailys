class Solution {
    public int getWinner(int[] arr, int k) {
        return getWinnerSmart(arr, k);
    }

    public int getWinnerSimple(int[] arr, int k) {
        Queue<Integer> losers = new ArrayDeque<>();
        for (Integer i : arr) losers.add(i);

        int wins = 0;
        int saved = losers.poll();
        while (wins < k) {
            int compareTo = losers.poll();

            if (compareTo > saved) {
                wins = 1;
                losers.add(saved);
                saved = compareTo;
            } else {
                wins++;
                losers.add(compareTo);
            }
            if (wins == arr.length) break;
        }
        return saved;
    }

    public int getWinnerSmart(int[] arr, int k) {
        int curr = arr[0];

        int wins = 0;
        int max = curr;
        for (Integer i : arr) max = Math.max(max, i);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > curr) {
                wins = 1;
                curr = arr[i];
            } else {
                wins++;
            }

            if (wins == k || curr == max) break;
        }

        return curr;
    }
}
