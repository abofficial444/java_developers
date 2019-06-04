//push to github project_002
								//444 DICE GAMBLING GAME [08039160301]
import java.util.Scanner;

public class betting {

	
		Scanner input = new Scanner(System.in);
		 String name;
		 String menu[] = {"1) Start Game", "2) Help"};
		 int money;
		 int betoption;
		int betmoney;
		int pot;
		int menuchoice;


		void display() 
		{
		
			System.out.println("kindly input your  name");
			name = input.nextLine();
			System.out.println("welcome, "+name+" to this gambling game!\nplease select one of the following numbers;");
			for(int i=0 ; i<menu.length; i++) {
				System.out.println(menu[i]);
			}
			 menuchoice = input.nextInt();
			 startGame();
		}
		
		
			
		 void startGame() {
			if (menuchoice==1){
				money();
				}
			else if(menuchoice==2) {
				help();
			}
			else {
				System.out.println("invalid option");
				notValid();
			}
		}
		
		void startGame2() {
			
			for(int i=0 ; i<menu.length; i++)
			{
				System.out.println(menu[i]);
			}
			 menuchoice = input.nextInt();
			 
			if (menuchoice==1){
				System.out.println("you have $"+money+" to gamble with");
			
				betoption();
				}
			else if(menuchoice==2) {
				help2();
			}
			else {
				System.out.println("invalid option");
				notValid2();
			}
		}

		 void startGame3() {
			if (menuchoice==1){
				money2();
				}
			else if(menuchoice==2) {
				help();
			}
			else {
				System.out.println("invalid option");
				notValid();
			}
		}
			
		void notValid() {
				for(int i=0 ; i<menu.length; i++) {
					System.out.println(menu[i]);
				}
				 menuchoice = input.nextInt();
				 startGame();
			}
		
		void notValid2() {
			for(int i=0 ; i<menu.length; i++) {
				System.out.println(menu[i]);
			}
			 menuchoice = input.nextInt();
			 startGame2();
		}
				
		void money() {
			money =500;
			System.out.println("you have $"+money+" to gamble with.");
			betoption();
		}

		void money2() {
			money =money+pot;
			System.out.println("you have $"+money+" balance to gamble with.");
			betoption();
		}
		
		void betoption() {
			System.out.println("state which side to pick.\nREMEMBER: there are only 6 sides to a dice");
			betoption =input.nextInt();
			if(betoption >= 7) {
				System.out.println("that is not a valid option");
			}
			else {
				userbet();
			}
		}
			
		void userbet() {
			
		
			System.out.println("how much are u betting?");
			betmoney=input.nextInt();
			if(betmoney>money) {
				System.out.println("YOU DONT HAVE ENOUGH MONEY");
				userbet();
			}
			else if(money == 0) {
				System.out.println("sorry, you have lost all your money!");
			}
			else {
				money = money-betmoney;
				System.out.println("You bet $"+betmoney+" on this game");
				game();
			}
				
			
		}

		void game() {
			int randomnumber = (int)Math.round(Math.random()*5+1);
			int pot =  (int)Math.round(Math.random()*249+1);
			if(betoption == randomnumber) 
			{
				System.out.println("congrat! you won $"+pot);
				money =money+pot;
				startGame3();
			}
			else
			{
				if(money == 0) {
					System.out.println("you have lost all your money! try again");
			}
			else
			{
				betoption();
			}
			}
			
		}
		void help() {
			System.out.println("follow the instructions");
			money();
		}
		
		void help2() {
			System.out.println("follow the instructions");
			betoption();
		}
			
		public static void main(String[] args) {

			//CALLS THE FUNCTION FROM THE CLASS
		betting condition = new betting();
	

		System.out.println("\t"+"444 DICE GAMBLING GAME.");
		condition.display();
	
		}
}
		

	
