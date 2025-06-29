https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ret=new ArrayList<>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                ret.add(true);
            }
            else{
                ret.add(false);
            }
        }
        return ret;
    }
}