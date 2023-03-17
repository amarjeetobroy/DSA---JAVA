/* Given a "2 x n" board and tiels of size " 2 x 1" count the number of ways to tile the given using the 2 x 1 tiels
(A tiel can either be placed horizontally or verticaally) */


public class Tiling{
public static int tilingproblem(int n){
			if(n==0 || n==1){
				return 1;
			}

			//vertical choice
			int fnm1 = tilingproblem(n-1);

			//horizontal choice
			int fnm2 = tilingproblem(n-2);

			int totways = fnm1+fnm2;
			return totways;
		}
		public static void main(String[] args) {
			System.out.println(tilingproblem(5));
		}
	}

/* Output
your Ans: 8

*/
