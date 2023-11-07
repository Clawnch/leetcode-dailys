class Solution {

    public int eliminateMaximum(int[] dist, int[] speed) {
        // return eliminateMaximumArray(dist, speed);
        return eliminateMaximumHeap(dist, speed);
    }

    public int eliminateMaximumArray(int[] dist, int[] speed) {
        int size = dist.length;
        double[] arrivals = new double[size];

        for (int i = 0; i < size; i++) {
            arrivals[i] = (double)dist[i] / speed[i];
        }

        int kills = 0;
        Arrays.sort(arrivals);

        for (int i = 0; i < size; i++) {
            if (arrivals[i] <= i) {
                return kills;
            }
            kills++;
        }

        return kills;
    }

    public int eliminateMaximumHeap(int[] dist, int[] speed) {
        int size = dist.length;
        PriorityQueue<Double> heap = new PriorityQueue<>();

        for (int i = 0; i < size; i++) {
            heap.add((double)dist[i] / speed[i]);
        }

        int kills = 0;

        while (!heap.isEmpty()) {
            if (heap.remove() <= kills) {
                return kills;
            }
            kills++;
        }

        return kills;
    }
}
