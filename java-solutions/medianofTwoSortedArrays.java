class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int index = 0;
        int totalLength = nums1.length + nums2.length;
        int[] mergedNums = new int[totalLength];
        while (j < nums1.length && i < nums2.length) {
            if (nums1[j] <= nums2[i]) {
                mergedNums[index] = nums1[j];
                j++;
            } else {
                mergedNums[index] = nums2[i];
                i++;
            }
            index++;
        }
        if (j != nums1.length) {
            for (; j < nums1.length; j++) {
                mergedNums[index] = nums1[j];
                index ++;
            }
        } else {
            for (; i < nums2.length; i++) {
                mergedNums[index] = nums2[i];
                index ++;
            }
        }

        if (totalLength % 2 != 0) {
            return mergedNums[totalLength/2];
        }
        else {
            int check = totalLength / 2;
            return (double)(mergedNums[check] + mergedNums[check -1]) /2;
        }
    }
}