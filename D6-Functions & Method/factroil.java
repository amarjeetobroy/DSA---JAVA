// Factroil of a number n

public class Factroil{	
public static int factroil(int n){
		int f = 1;
		for(int i=1;i<=n;i++){
			f = f*i;
		}
		return f;
	}
	public static void main(String[] args) {
		System.out.println(factroil(4));
	}
}

/* Output

24

*/
