https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] empty=new int[m][n];
        int count=0;
        for(int a[]:indices){
            for(int i=0;i<a.length;i++){
                    if(i==0){
                        for(int j=0;j<n;j++){
                            empty[a[i]][j]++;
                        }
                    }
                    else{
                        for(int j=0;j<m;j++){
                            empty[j][a[i]]++;
                        }
                    }
            }
        }
        for(int b[]:empty){
            for(int i=0;i<b.length;i++){
                if(b[i]%2==1){
                    count++;
                }
            }
        }
        return count;
    }
}