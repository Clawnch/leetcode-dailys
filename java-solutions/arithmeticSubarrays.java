class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> results = new ArrayList<>();
		//go through the sub array sections and get start and end of each sub array
        for (int i = 0; i < l.length; i++) {
            int start = l[i], end = r[i];
			//create the sub array, inclusive
            int[] dest = new int[end - start + 1];
            for (int j = start; j <= end; j++) {
                dest[j - start] = nums[j];
            }
            
            results.add(isArithmetic(dest));
        }
        return results;
    }
	
	//sorts the array to organize it, then checks the steps between each number. 
	//If the step between two numbers are not the same, it is not arithmetic
    public boolean isArithmetic(int[] n) {
        Arrays.sort(n);
        if (n.length == 1) return true;
        int difference = n[1] - n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] - n[i-1] != difference) return false;
        }
        return true;
    }
}
