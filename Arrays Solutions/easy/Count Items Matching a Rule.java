https://leetcode.com/problems/count-items-matching-a-rule/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int a=(ruleKey.equals("type")) ? 0:(ruleKey.equals("color"))? 1:2;
        int count=0;
        for(int i=0;i<items.size();i++){
            
                if(items.get(i).get(a).equals(ruleValue)){
                    count++;
                }
            
        }
        return count;
    }
}