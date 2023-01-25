// class Solution{

//     public int firstBadVersion(int n) {
//         int i = 1;
//         int j = n;
        
//     while(i <= j){
//         /* Creating the starting point. We reduce the API calls to the half 
//         depending if the half version is good or bad.*/
//         int half = (i + (j - i) / 2);

//         if(isBadVersion(half) == false){
//             /* If half version is a good one, we reduce the range where we are finding
//             the bad version by making the starting point at half + 1 */
//             i = half + 1;
//         }else{
//             /* Else if the half version is truly a bad version, we make the ending point
//             to be at half - 1 */
//             j = half - 1;
//         }
//         /* We iterate until we find the first bad version. It will be exactly when i is bigger than j */
//     }
//     return i;
//     }
// }