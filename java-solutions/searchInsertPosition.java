class Solution {
    public int searchInsert(int[] nums, int target) {
        int checked = binarySearchIndex(0, nums.length-1, nums, target);
        if (nums[checked] < target) return checked + 1;
        return checked;
    }

    public int binarySearchIndex(int l, int r, int[] nums, int target) {
        int index = l + (r - l) / 2;
        while (l <= r) {
            index = l + (r - l) / 2;
            int value = nums[index];
            if (value == target) return index;
            if (value > target) {
                r = index - 1;
            } else {
                l = index + 1;
            }
        }
        return index;
    }
}