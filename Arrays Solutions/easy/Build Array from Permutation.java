#problem https://leetcode.com/problems/build-array-from-permutation/

class Solution {
    public int[] buildArray(int[] nums) {
        int[] per=new int[nums.length];
        for(int i=0;i<nums.length;i++ ){
            per[i]=nums[nums[i]];
        }
        return per;
    }
}
