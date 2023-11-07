class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int maxCount = 1, currCount = 1, highestInt = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                currCount++;
                if (currCount > maxCount) {
                    maxCount = currCount;
                    highestInt = nums[i];
                }
            } else {
                currCount = 1;
            }
        }

        return highestInt;
    }
}
