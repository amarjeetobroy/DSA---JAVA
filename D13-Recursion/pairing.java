// Friends pairing problem

		// Given n friends each one can remain single or can be paired up with some other friend.
		// Each friend can be paired only once. Find out the total number of ways in which friends can 
		// remain single or can be paired up

public class pairing{		
public static int friendspairing(int n){
			if(n == 1 || n == 2){
				return n;
			}

			// choice
			// single

			int fnm1 = friendspairing(n-1);

			//pair

			int fnm2 = friendspairing(n-2);
			int pairways = (n-1) * fnm2;

			//totalways

			int totways = fnm1+pairways;
			return totways;
		}
		public static void main(String[] args) {
			System.out.println(friendspairing(3));
		}
	}

/* Output
 4
 */
