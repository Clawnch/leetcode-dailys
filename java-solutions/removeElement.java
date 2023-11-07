class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        int adjustedSize = size -1;

        int i = 0;
        while (i <= adjustedSize) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[adjustedSize];
                nums[adjustedSize] = temp;
                adjustedSize--;
            } else {
                i++;
            }
        }

        return adjustedSize + 1;
    }
}
