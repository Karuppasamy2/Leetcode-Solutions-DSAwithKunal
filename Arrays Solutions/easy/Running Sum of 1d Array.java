https://leetcode.com/problems/running-sum-of-1d-array/description/

class Solution {
    public int[] runningSum(int[] nums) {
        int[] ret = new int[nums.length];
        int sums = 0;
        for (int i = 0; i < nums.length; i++) {
            sums += nums[i];
            ret[i] = sums;
        }
        return ret;
    }
}