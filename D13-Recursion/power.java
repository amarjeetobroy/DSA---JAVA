// print x to the power n

public class Recursion{	
public static int power(int x, int n){
			if(n == 0){
				return 1;
			}
			return x * power(x,n-1);
		}
		public static void main(String[] args) {
			System.out.println("Your ans is:"+power(2,10));
		}
	}

/* Output
Your ans is:1024
*/
