#problem:  https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ret=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ret[i]=nums[i];
            ret[i+nums.length]=nums[i];
        }
    return ret;
    }
}