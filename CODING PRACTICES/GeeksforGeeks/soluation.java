/*N horizontal line segments are arranged on the X-axis of a 2D plane.
The start and end point of each line segment is given in a Nx2 matrix lines[ ][ ].
Your task is to find the maximum number of intersections possible of any vertical
line with the given N line segments.


Example 1
Input:
N = 4
lines[][] = {{1,3}, {2,3}, {1,2}, {4,4}}
Output:
3
Explanation:
A vertical line at X = 2 passes through 
{1,3}, {2,3}, {1,2}, ie three of the 
given horizontal lines.

Example 2:

Input: 
N = 3
lines[][] = {{1, 3}, {5, 6}, {3,4}}
Output:
2
Explanation: 
A vertical line at X = 3 passes through 
two of the given horizontal lines which 
is the maximum possible.*/

class Solution {
    public int maxIntersections(int[][] lines, int N) {
        // Code here
        int count = 0 , maxCount = 0;
        int a[] = new int[N];
        int b[] = new int[N];
        for(int i=0;i<N;i++){
            a[i] = lines[i][0];
            b[i] = lines[i][1];
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0 , j = 0;
        while(i<N){
            if(a[i] <= b[j]){
                count++;
                maxCount = Math.max(count,maxCount);
                i++;
            }
            else{
                count--;
                j++;
            }
        }
        return maxCount;
    }
}
