package sce.cz2002.twl.lab1;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String cur = "";
		
		System.out.println("Height: ");
		int height = myObj.nextInt();
		if (height <= 0) {
			System.out.println("Error input!");
		}
		else {
			for (int i = 1;i<=height;i++) {
				if (i%2 == 0) {
					String newstr = "BB" + cur;
					cur = newstr;
					System.out.println(cur);
				}
				else {
					String newstr = "AA" + cur;
					cur = newstr;
					System.out.println(cur);
				}
			}
		}
	}
}
