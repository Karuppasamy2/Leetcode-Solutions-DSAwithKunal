https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            int sum=0;
            while(n>0){
                n=n/10;
                sum++;
            }
            if(sum%2==0){
                count++;
            }
        }return count;
    }
}