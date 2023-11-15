class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        //Counts the number of occurances of a number and stores in map
        for (int i = 0; i < nums.length; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }
        
        //Contraints say there is only number that appears with a frequency of 1
        //This sorts and returns the key of the integer that only appears once in the Map.
        return counts.entrySet().stream()
            .filter(e -> e.getValue() == 1)
            .map(e -> e.getKey())
            .findFirst()
            .get();
            
    }
}
