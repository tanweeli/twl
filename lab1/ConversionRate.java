package sce.cz2002.twl.lab1;
import java.util.Scanner;

public class ConversionRate {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Starting : ");
		short start = myObj.nextShort();
		
		System.out.println("Ending : ");
		short end = myObj.nextShort();
		
		System.out.println("Increment : ");
		short inc = myObj.nextShort();

		System.out.println("US$			S$");
		System.out.println("----------------------------");
		
		for (short i = start; i <= end; i = (short) (i + inc)) {
			System.out.println(i + " 			" + i*1.82);
		}
		
		System.out.println("Starting : ");
		short start2 = myObj.nextShort();
		
		System.out.println("Ending : ");
		short end2 = myObj.nextShort();
		
		System.out.println("Increment : ");
		short inc2 = myObj.nextShort();

		System.out.println("US$			S$");
		System.out.println("----------------------------");
		
		short i2 = start2;
		while (i2 <= end2) {
			System.out.println(i2 + " 			" + i2*1.82);
			i2 = (short) (i2 + inc2);
		}
		
		
		System.out.println("Starting : ");
		short start3 = myObj.nextShort();
		
		System.out.println("Ending : ");
		short end3 = myObj.nextShort();
		
		System.out.println("Increment : ");
		short inc3 = myObj.nextShort();
		
		if (start3 > end3) {
			System.out.println("Error input!");
		}
		else {
			System.out.println("US$			S$");
			System.out.println("----------------------------");
			
			short i3 = start3;
			do {
				System.out.println(i3 + " 			" + i3*1.82);
				i3 = (short) (i3 + inc3);
				
			}
			while(i3 <= end);
		}


	}
}
