package sce.cz2002.twl.lab1;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		char choice = myObj.next().charAt(0);
		
		switch (choice) {
		case 'a':
			System.out.println("Action movie fan");
			break;
		case 'A':
			System.out.println("Action movie fan");
			break;
		case 'c':
			System.out.println("Comedy movie fan");
			break;
		case 'C':
			System.out.println("Comedy movie fan");
			break;
		case 'd':
			System.out.println("Drama movie fan");
			break;
		case 'D':
			System.out.println("Drama movie fan");
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}

}
