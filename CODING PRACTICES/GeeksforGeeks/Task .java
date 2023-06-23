/* Given a character array tasks of size N, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.
CPU has a cooldown period for each task. CPU can repeat a task only after atleast K units of time has passed after it did same task last time. It can perform other tasks in that time, can stay idle to wait for repeating that task.

Return the least number of units of times that the CPU will take to finish all the given tasks.

Example 1:

Input:
N = 6
K = 2
task[ ] = {'A', 'A', 'A', 'B', 'B', 'B'}
Output: 8
Explanation: 
A -> B -> idle -> A -> B -> idle -> A -> B
There is atleast 2 units of time between any two same tasks.
 
Example 2:

Input:
N = 12
K = 2
task[ ] = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}
Output: 16
Explanation:  
One possible solution is 
A -> B -> C -> A -> D -> E -> A -> F -> G -> A -> idle -> idle -> A -> idle -> idle -> A.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function leastInterval() which takes the interger N, integer K and an character array tasks as parameters and returns the minimum unit of time required to complete all tasks.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
  */
class Solution {
    static int leastInterval(int N, int K, char tasks[]) {
        // code here
        int f[] = new int [26];
        for(char task: tasks){
            f[task-'A']++;
        }
        Arrays.sort(f);
        int maxfre = f[25]-1;
        int idle = (maxfre)*K;
        for(int i=24;i>=0;i--){
            idle-=Math.min(maxfre,f[i]);
        }
        return (idle<0)? tasks.length: idle+tasks.length;
    }
}
/* 
For Input: 
6 2 
A A A B B B
Your Output: 
8
Expected Output: 
8
  */
