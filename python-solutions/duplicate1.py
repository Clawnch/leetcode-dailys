class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        unique = {}
        for x in nums:
            if (x in unique):
                return True
            unique[x] = 1
        return False
        