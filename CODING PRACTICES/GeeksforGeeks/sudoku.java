/* Given an incomplete Sudoku configuration in terms of a 9 x 9  2-D square matrix (grid[][]), the task is to find a solved Sudoku. For simplicity, you may assume that there will be only one unique solution.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
Zeros in the grid indicates blanks, which are to be filled with some number between 1-9. You can not replace the element in the cell which is not blank.


Sample Sudoku for you to get the logic for its solution:



Example 1:

Input:
grid[][] = 
[[3 0 6 5 0 8 4 0 0],
[5 2 0 0 0 0 0 0 0],
[0 8 7 0 0 0 0 3 1 ],
[0 0 3 0 1 0 0 8 0],
[9 0 0 8 6 3 0 0 5],
[0 5 0 0 9 0 6 0 0],
[1 3 0 0 0 0 2 5 0],
[0 0 0 0 0 0 0 7 4],
[0 0 5 2 0 6 3 0 0]]
Output:
True
3 1 6 5 7 8 4 9 2
5 2 9 1 3 4 7 6 8
4 8 7 6 2 9 5 3 1
2 6 3 4 1 5 9 8 7
9 7 4 8 6 3 1 2 5
8 5 1 7 9 2 6 4 3
1 3 8 9 4 7 2 5 6
6 9 2 3 5 1 8 7 4
7 4 5 2 8 6 3 1 9
Explanation: 
There exists a valid Sudoku for the input grid, which is shown in output.
Example 2:

Input:
grid[][] = 
[[3 6 6 5 0 8 4 0 0],
[5 2 0 0 0 0 0 0 0],
[0 8 7 0 0 0 0 3 1 ],
[0 0 3 0 1 0 0 8 0],
[9 0 0 8 6 3 0 0 5],
[0 5 0 0 9 0 6 0 0],
[1 3 0 0 0 0 2 5 0],
[0 0 0 0 0 0 0 7 4],
[0 0 5 2 0 6 3 0 0]]
Output:
False
Explanation: 
There does not exists a valid Sudoku for the input grid, since there are two 6s in the first row. Which cannot replaced.
Your Task:
You need to complete the two functions:

SolveSudoku(): Takes a grid as its argument and returns true if a solution is possible and false if it is not, on returning false driver will print "No solution exists".

printGrid(): Takes a grid as its argument and prints the 81 numbers of the solved Sudoku in a single line with space separation. Do not give a new line character after printing the grid.

Expected Time Complexity: O(9N*N).
Expected Auxiliary Space: O(N*N).
  */

class Solution
{
    HashMap<Integer,HashSet<Integer>> r;
    HashMap<Integer,HashSet<Integer>> c;
    HashMap<Integer,HashSet<Integer>> g;
     boolean isSafe(int i,int j,int x)
    {
        if(r.get(i).contains(x) || c.get(j).contains(x) || g.get((i/3)*10+(j/3)).contains(x))
        return false;
        return true;
    }
     boolean solve(int grid[][],int i,int j)
    {
        if(i==8 && j==9)
        return true;
        if(j==9)
        {
            i++;
            j=0;
        }
        if(grid[i][j]!=0)
        return solve(grid,i,j+1);
        for(int x=1;x<=9;x++)
        {
            if(isSafe(i,j,x))
            {
                r.get(i).add(x);
                c.get(j).add(x);
                g.get((i/3)*10+(j/3)).add(x);
                grid[i][j]=x;
                if(solve(grid,i,j+1))
                return true;
                r.get(i).remove(x);
                c.get(j).remove(x);
                g.get((i/3)*10+(j/3)).remove(x);
            }
            
        }
        grid[i][j]=0;
        return false;
    }
    //Function to find a solved Sudoku. 
     boolean SolveSudoku(int grid[][])
    {
        r=new HashMap<>();
        c=new HashMap<>();
        g=new HashMap<>();
        g.put(0,new HashSet<>());
        g.put(1,new HashSet<>());
        g.put(2,new HashSet<>());
        g.put(10,new HashSet<>());
        g.put(11,new HashSet<>());
        g.put(12,new HashSet<>());
        g.put(20,new HashSet<>());
        g.put(21,new HashSet<>());
        g.put(22,new HashSet<>());
        for(int i=0;i<9;i++)
        {
            r.put(i,new HashSet<>());
            c.put(i,new HashSet<>());
            for(int j=0;j<9;j++)
            {
                if(grid[i][j]!=0)
                r.get(i).add(grid[i][j]);
                if(grid[j][i]!=0)
                c.get(i).add(grid[j][i]);
                if(grid[i][j]!=0)
                g.get((i/3)*10+(j/3)).add(grid[i][j]);
            }
        }
        return solve(grid,0,0);
        // add your code here
    }
    
    //Function to print grids of the Sudoku.
     void printGrid (int grid[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            System.out.print(grid[i][j]+" ");
        }
        // add your code here
    }
}

/* Output
  For Input: 
3 0 6 5 0 8 4 0 0 5 2 0 0 0 0 0 0 0 0 8 7 0 0 0 0 3 1 0 0 3 0 1 0 0 8 0 9 0 0 8 6 3 0 0 5 0 5 0 0 9 0 6 0 0 1 3 0 0 0 0 2 5 0 0 0 0 0 0 0 0 7 4 0 0 5 2 0 6 3 0 0
Your Output: 
3 1 6 5 7 8 4 9 2 5 2 9 1 3 4 7 6 8 4 8 7 6 2 9 5 3 1 2 6 3 4 1 5 9 8 7 9 7 4 8 6 3 1 2 5 8 5 1 7 9 2 6 4 3 1 3 8 9 4 7 2 5 6 6 9 2 3 5 1 8 7 4 7 4 5 2 8 6 3 1 9
Expected Output: 
3 1 6 5 7 8 4 9 2 5 2 9 1 3 4 7 6 8 4 8 7 6 2 9 5 3 1 2 6 3 4 1 5 9 8 7 9 7 4 8 6 3 1 2 5 8 5 1 7 9 2 6 4 3 1 3 8 9 4 7 2 5 6 6 9 2 3 5 1 8 7 4 7 4 5 2 8 6 3 1 9
  */
