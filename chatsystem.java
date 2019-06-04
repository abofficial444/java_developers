//push to github project_004
								//LETS CHAT APP PROGRAMMED BY [08039160301]
import java.util.Calendar;
import java.util.Scanner;

public class chatsystem{

	Scanner chat1 = new Scanner(System.in);
	Scanner chat2 = new Scanner(System.in);
	Scanner user1 = new Scanner(System.in);
	Scanner user2 = new Scanner(System.in);

	Calendar cal = Calendar.getInstance();


	String usera,userb;
	String type1,type2;


	void chatting1()
	{

		System.out.println(usera);
		type1 = chat1.nextLine();

		if(type1.equals("chat later"))
		{
			System.out.println(usera+" have stopped the ongoing chat...");
			goodbye();
		}

		else
		{
		System.out.println( "\t"+"\t"+"\t"+"["+cal.get(Calendar .HOUR_OF_DAY)+":" +cal.get(Calendar .MINUTE)+":"+cal.get(Calendar .SECOND)+"]");
		System.out.println("\t"+"\t"+"\t"+usera+ ": "+type1);
		chatting2();
		}

	}

	void chatting2()
	{	
	
		System.out.println(userb);
		type2 = chat2.nextLine();
		if(type2.equals("chat later"))
		{
			System.out.println(userb+" have stopped the ongoing chat...");
			goodbye();
		}

		else
		{
		System.out.println( "\t"+"\t"+"\t"+"\t"+"\t"+"["+cal.get(Calendar .HOUR_OF_DAY)+":" +cal.get(Calendar .MINUTE)+":"+cal.get(Calendar .SECOND)+"]");
		System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+userb+": "+type2);
		chatting1();
		}
	}

	void user1()
	{
		System.out.println("user1 enter you name :");
		usera = user1.nextLine();
		user2();

	}


	void user2()
	{
		System.out.println("user2 enter you name :");
		userb = user2.nextLine();
		System.out.println("\t"+"\t"+usera +" and "+ userb+" is about to start a chat\n in 3secs time start chatting");
		System.out.println("\n");
		try{
			Thread.sleep(3000);
			chatting1();
			}

		catch(InterruptedException e)
			{
		System.err.println(e.getMessage());
			}

		

	}

		void goodbye()
		{
			System.out.println("goodbye");

		}
		


	public static void main(String []a){
		chatsystem condition = new chatsystem();
		
		

		System.out.println("\t" +"\t" +"\t" +"\t"+" "+" " +" [LET CHATS APP]");
		System.out.println("\t" +"\t"+"\t"+".....................................");
		System.out.println("\t" +"\t"+ "\t" +"\t"+"Welcome to Letschatapp");
		System.out.println("\t" +"\t"+"\t"+".....................................");

		condition.user1();
		
	
	}
}