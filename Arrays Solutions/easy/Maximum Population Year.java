// https://leetcode.com/problems/maximum-population-year/


// my myethod
class Solution {
    public int maximumPopulation(int[][] logs) {
      
        int[] time=new int[101];
        for(int i=0;i<logs.length;i++){
        for(int j=logs[i][0];j<logs[i][1];j++){
           time[j-1950]++;
           
        }
        }
        int max=time[0];
        int number=0;
        for(int i=0;i<time.length;i++){
            if(time[i]>max){
                max=time[i];
                number=i;
            }
        }
        return number+1950;


    }
}

// prefix sum answer

// class Solution {
//     public int maximumPopulation(int[][] logs) {
//         int[] yearCount = new int[101];  // years from 1950 to 2050

//         // Step 1: Mark birth and death changes
//         for (int[] log : logs) {
//             yearCount[log[0] - 1950]++;   // +1 at birth year
//             yearCount[log[1] - 1950]--;   // -1 at death year (exclusive)
//         }

//         // Step 2: Apply prefix sum to get actual population for each year
//         int maxYear = 1950;
//         int maxPopulation = yearCount[0];
//         for (int i = 1; i < 101; i++) {
//             yearCount[i] += yearCount[i - 1];  // carry over population

//             if (yearCount[i] > maxPopulation) {
//                 maxPopulation = yearCount[i];
//                 maxYear = 1950 + i;
//             }
//         }

//         return maxYear;
//     }
// }

