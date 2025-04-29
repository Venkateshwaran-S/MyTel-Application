package mytel;
import java.util.Scanner;

public class MytelApplication {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("                    Mytel application:                 ");
	        System.out.println("Welcome to Mytel :");
	        
	        while (true) {
	            displayMainMenu();
	            int i = getIntInput();
	            
	            Appdata1 s = new Appdata1();
	            switch(i) {
	                case 1: s.mobilerecharge(scanner); break;
	                case 2: s.paybills(scanner); break;
	                case 3: s.convert(scanner); break;
	                case 4: s.balance(scanner); break;
	                case 5: s.profile(scanner); break;
	                case 0: s.exit(); return;
	                default: System.out.println("Invalid option!");
	            }
	        }
	    }

	    private static void displayMainMenu() {
	        System.out.println("Enter option 1 for mobile recharge");
	        System.out.println("Enter option 2 for pay bills");
	        System.out.println("Enter option 3 to convert prepaid to postpaid / postpaid to prepaid");
	        System.out.println("Enter option 4 to know the balance");
	        System.out.println("Enter option 5 for profile details");
	        System.out.println("Enter 0 to exit");
	    }

	    private static int getIntInput() {
	        while (!scanner.hasNextInt()) {
	            System.out.println("Please enter a valid number!");
	            scanner.next(); // discard invalid input
	        }
	        return scanner.nextInt();
	    }
		}


interface Appdata
{
	public void mobilerecharge(Scanner scan);
	public void paybills(Scanner scan);
	public void paymentdetails(Scanner scan);
	public void convert(Scanner scan);
	public void balance(Scanner scan);
	public void profile(Scanner scan);
	public void exit();
	
}
class Appdata1 implements Appdata{
	
	public void mobilerecharge(Scanner scan)
	{
		System.out.println("Enter Prepaid number:");
			scan.nextLong();
			  System.out.println("Packages:\r\n"
		  		+ "package 1\r\n"
		  		+ "Amount 200\r\n"
		  		+ "Validity 30 days\r\n"
		  		+ "Data 3GB/day\r\n"
		  		+ "package 2\r\n"
		  		+ "Amount 300\r\n"
		  		+ "Validity 30 days\r\n"
		  		+ "Data 6GB/day");
		  System.out.println("Enter the appropriate package number to proceed further");
		    scan.nextInt();
		    paymentdetails(scan);
		    System.out.println("Congratulations..your recharge is successful..");
		   menuorexit(scan);
		    }
	
	public void paybills(Scanner scan) 
	{
		System.out.println("Enter Post paid number:");
	    scan.nextLong();
		System.out.println("Bill due amount is 600 INR");
		paymentdetails(scan);
		System.out.println("Congratulations..your bill amount is paid successful..");
		menuorexit(scan);
	}
	
	public void paymentdetails(Scanner scan)
	{
		
             System.out.println("Enter payment details:");
			 System.out.println("Enter debit card/credit card number:");
			 scan.nextInt();
			 System.out.println("Enter Expiry date:");
			 scan.nextLine();
			 scan.nextLine();
		     System.out.println("Enter CVV number:");
	         scan.nextInt();
			}
	
	public void convert(Scanner scan)
	{
		System.out.println("Enter mobile number:");
			scan.nextLong();
		 System.out.println("Enter option 6 to convert prepaid to post");
		System.out.println("Enter option 7 to convert post to prepaid");
		scan.nextInt();
		System.out.println("Congrats!!your request is received. You new SIM will be delivered within 2 days to your address");
		menuorexit(scan);
	}
	
	public void balance(Scanner scan) 
	{
		System.out.println("Enter mobile number:");
			scan.nextLong();
		 System.out.println("Balance:\r\n"
				+ "SMS : 30\r\n"
				+ "Talktime : unlimited\r\n"
				+ "Data : 1.GB");
		menuorexit(scan);
		
	}
	
	public void profile(Scanner scan) 
	{
		System.out.println("Enter mobile number:");
  	   scan.nextLong();
		 System.out.println("Name:Venkateshwaran\r\n"
				+ "Address: Pudukkottai, Tamilnadu");
		menuorexit(scan);
		
	}
	
	public void exit() 
	{
		System.out.println("Exited Application Successfully....");
		System.exit(0);
	}
	
	public void menuorexit(Scanner scan) 
	{
		 System.out.println("Enter option 9 to go back to main options");
		 System.out.println("Enter 0 to exit");
			int j = scan.nextInt();
         switch(j) 
           {
           case 9:return;
           case 0:exit(); break;
           default: System.out.println("Invalid option!");
           }
		
		}
	}
	