import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>();

	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(5);
		System.out.println(list);
        System.out.println(list.contains(4));

        System.out.println(list.contains(11));
    
	}
}
/* Output
  [1, 2, 3, 4, 5]
  true
  false
  */
