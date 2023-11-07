class SeatManager {
    List<Integer> available = new ArrayList<>();

    public SeatManager(int n) {
        for (int i = 1; i <= n; i++) {
            available.add(i);
        }
    }
    
    public int reserve() {
        return available.remove(0);
    }
    
    public void unreserve(int seatNumber) {
        for (int i = 0; i < available.size(); i++) {
            if (seatNumber < available.get(i)) {
                available.add(i, seatNumber);
                return;
            }
        }

        available.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
 