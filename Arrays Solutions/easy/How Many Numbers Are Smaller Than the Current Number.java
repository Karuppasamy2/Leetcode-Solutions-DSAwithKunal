https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket=new int[102];
        int[] ret=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           bucket[nums[i]]++;
        }
        for(int i=1;i<bucket.length;i++){
            bucket[i]=bucket[i]+bucket[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ret[i]=0;
            }
            else{
            ret[i]=bucket[nums[i]-1];
            }
        }
        return ret;
    }
}