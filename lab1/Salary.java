package sce.cz2002.twl.lab1;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter your salary: ");
		short salary = myObj.nextShort();
		
		System.out.println("Enter your merit points: ");
		int mp = myObj.nextInt();
		
		if (salary < 600 | salary >= 600 & salary <=649 & mp < 10 ) {
			System.out.println("Your Grade is C.");
		}
		else if (salary >= 600 & salary <=649 & mp >= 10 | salary >= 700 & salary <= 799 & mp < 20) {
			System.out.println("Your Grade is B.");
		}
		else {
			System.out.println("Your Grade is A.");
		}
		

	}

}
