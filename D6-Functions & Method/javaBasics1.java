// Function overloading

	// multiple functions with the same name but differnt parameters

public class javaBasics{	
public static int sum(int a, int b){
		return a+b;
	}
	public static int sum (int a, int b, int c){
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(sum(5,3));
		System.out.println(sum(5,2,1));
	}
}

/* Output
 8
 8
 */
