import java.util.ArrayList;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(7);
		list.add(6);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

/* Output
  [2, 5, 8, 9, 7, 6]
[2, 5, 6, 7, 8, 9]
*/
