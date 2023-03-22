// creating an Array

import java.util.Scanner;
public class Arraycc{
	public static void main(String[] args) {
		int marks[]=new int[100];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks:");
		marks[0]=scan.nextInt();
		marks[1]=scan.nextInt();
		marks[2]=scan.nextInt();
		System.out.println("phy: "+ marks[0]);
		System.out.println("chem: "+ marks[1]);
		System.out.println("math: "+ marks[2]);
		int percentage=(marks[0]+marks[1]+marks[2])/3;
		System.out.println("Your marks percentage = "+percentage+"%");

	}
}
/* Input
Enter your marks:
56
98
12
  /* Output
phy: 56
chem: 98
math: 12
Your marks percentage = 55%
*/
