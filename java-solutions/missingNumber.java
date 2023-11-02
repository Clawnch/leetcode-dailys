class Solution {
    public int missingNumber(int[] nums) {
        // return fullMissing(nums);
        // return setMissing(nums);
        return bitMissing(nums);
    }

    public int fullMissing(int[] nums) {
        Arrays.sort(nums);
        int prev = -1;
        for (Integer i : nums) {
            if (prev + 1 != i) break;
            prev = i;
        }
        return prev + 1;
    }

    public int setMissing(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (Integer i : nums) numSet.add(i);

        for (int i = 0; i < nums.length; i++) {
            if (!numSet.contains(i)) return i;
        }

        return nums.length;
    }

    public int bitMissing(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ i ^ nums[i];
        }
        return result;
    }
}
