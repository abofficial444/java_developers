//push to github project_001

									//SUPER STORE_RECEIPT PRINT OUT PROGRAMMED BY [08039160301]
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Random;


public class superstore_receipt{
	

public static void main (String args [] ){

	
	String name,name2,name3;
	double quantity,quantity2,quantity3;
	double price,cash_paid,total1,price2,total2,price3,total3;
	String x;

	int finaltotal,change;
	int invoice;
	x =" x";
	
		
		Scanner input = new Scanner(System.in);
	
	
		System.out.println("Enter item : ");
		name = input.nextLine();

		System.out.println("Enter " + name + " price");
		price = input.nextDouble();

		System.out.println("Enter " + name + " quantity :");
		quantity = input.nextDouble();

		Scanner input2 = new Scanner(System.in);

		System.out.println("Enter item : ");
		name2 = input2.nextLine();

		System.out.println("Enter " + name2 + " price");
		price2 = input2.nextDouble();

		System.out.println("Enter " + name2 + " quantity :");
		quantity2 = input2.nextDouble();

		Scanner input3 = new Scanner(System.in);

		System.out.println("Enter item : ");
		name3 = input3.nextLine();

		System.out.println("Enter " + name3 + " price");
		price3 = input3.nextDouble();

		System.out.println("Enter " + name3 + " quantity :");
		quantity3 = input3.nextDouble();

		Scanner pay = new Scanner(System.in);
		total1 = (quantity * price);
		total2 = (quantity2 * price2);
		total3 = (quantity3 * price3);
		finaltotal = ((int)(total1+total2+total3));
		

		System.out.println(finaltotal);
		System.out.println("\n");
		System.out.println("Enter Cash paying :  ");
		cash_paid = pay.nextInt();
		change = (int)(cash_paid - finaltotal);
		

		System.out.println("\t"+"\t"+"\t"+"JMEC SUPERSTORES");
		System.out.println("\t"+"147, Lagos-Abeokuta Expressway, Abule-Egba");
		System.out.println("\t"+"\t"+"U-Turn B/Stop, Lagos.");
		System.out.println("\t"+"\t"+"Tel: 08037220301, 08033450404");
		System.out.println();
		System.out.println();

		

		Calendar cal = Calendar.getInstance();
		
		System.out.println("\t "  + "The current time " +(cal.getTime()));
		System.out.println();

		//generate random invoice number between transaction 1-5000 and not repeating any
		int size = 5000;

		Random random = new Random();

		ArrayList<Integer> number =new ArrayList<Integer>(size);
		for (int i = 1; i <=size; i++) {
			number.add(i);
			
		}
		
		
		while (number.size() > 0){
			int index = random.nextInt(number.size());
			System.out.println("invoice no : " + number.remove(index));
			System.out.println();
			break;
		}
		
		


		if (finaltotal < cash_paid)
	{
		System.out.print( quantity +" x "+ name);
		System.out.println("\t"+"\t"+ total1);
		System.out.print( quantity2 +" x "+ name2);
		System.out.println("\t"+"\t"+ total2);
		System.out.print( quantity3 +" x "+ name3);
		System.out.println("\t"+"\t"+ total3);
		System.out.println("......................");
		System.out.print("TOTAL N ");
		System.out.println("\t"+"\t"+ finaltotal);
		System.out.print("CASH PAID N ");
		System.out.println("\t"+"\t"+ cash_paid);
		System.out.println();
		System.out.print("CHANGE N ");
		System.out.println("\t"+"\t"+ change);
		System.out.println();
		System.out.println();
		System.out.println("\t"+"\t"+"OPENING HOURS");
		System.out.println("Monday-Saturday: 8am-11pm");
		System.out.println("\t"+"Sunday: 11am-10pm");
		System.out.println();
		System.out.println("Served by ADEGUNLE BABATUNDE");
		System.out.println("Thanks for your patronage");
	}

	else if (finaltotal == cash_paid)
	{
		System.out.print( quantity +" x "+ name);
		System.out.println("\t"+"\t"+ total1);
		System.out.print( quantity2 +" x "+ name2);
		System.out.println("\t"+"\t"+ total2);
		System.out.print( quantity3 +" x "+ name3);
		System.out.println("\t"+"\t"+ total3);
		System.out.println("......................");
		System.out.print("TOTAL N ");
		System.out.println("\t"+"\t"+ finaltotal);
		System.out.print("CASH PAID N ");
		System.out.println("\t"+"\t"+ cash_paid);
		System.out.print("\t"+"\t"+ "no change");
		System.out.println();
		System.out.println();
		System.out.println("\t"+"\t"+"OPENING HOURS");
		System.out.println("Monday-Saturday: 8am-11pm");
		System.out.println("\t"+"Sunday: 11am-10pm");
		System.out.println();
		System.out.println("Served by ANTHONY EMMANUEL");
		System.out.println("Thanks for your patronage");
	}
	else
	{
		System.out.print( quantity +" x "+ name);
		System.out.println("\t"+"\t"+ total1);
		System.out.print( quantity2 +" x "+ name2);
		System.out.println("\t"+"\t"+ total2);
		System.out.print( quantity3 +" x "+ name3);
		System.out.println("\t"+"\t"+ total3);
		System.out.println("......................");
		System.out.print("TOTAL N ");
		System.out.println("\t"+"\t"+ finaltotal);
		System.out.print("CASH PAID N ");
		System.out.println("\t"+"\t"+ cash_paid);
		System.out.println();
		System.out.print("You money remains " + "N"+ -change + " to balance");
		System.out.println();
		System.out.println();
		System.out.println("\t"+"\t"+"OPENING HOURS");
		System.out.println("Monday-Saturday: 8am-11pm");
		System.out.println("\t"+"Sunday: 11am-10pm");
		System.out.println();
		System.out.println("Served by ANTHONY EMMANUEL");
		System.out.println("Thanks for your patronage");
	}


		input.close();
		input2.close();
		input3.close();
		

}
}