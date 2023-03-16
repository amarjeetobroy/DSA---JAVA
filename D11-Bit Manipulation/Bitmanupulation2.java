// Get ith bit
// [0 0 0 0 0 1 0 0] - 1<<2 (1 <+i)
//   0 0 0 0 0 0 0 0 != 0 -> ith bit 1
//          0 -> ith bit 0

public class Bitmanipulation{
public static int getIthBit(int n, int i){
		int bitMask = 1 <<i;
		if((n & bitMask) == 0){
			return 0;
		}else{
			return 1;
		}
	}
	public static void main(String[] args) {
		System.out.println(getIthBit(10,4));
	}
}


/* Output
0
*/
