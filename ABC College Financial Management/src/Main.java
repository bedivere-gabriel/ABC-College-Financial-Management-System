import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student obj = new Student();
		int[] selectedmodules = new int[6];
		int repeatmods, newmods, totalmodules;
		float amountpaid, balance;
		boolean running = true;
		
		while (running)
		{
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Total Modules " + obj.totalModules);
			obj.displayModules();
			System.out.println(" ");
			System.out.println(" ");
			obj.getModules();
			System.out.println(" ");
			System.out.println(" ");
			obj.selectModules();
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Your total assessment is :$" + obj.computeTotalAmount());
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("Enter the amount paid: ");
			amountpaid = sc.nextFloat();
			balance = obj.getAmounPaid(amountpaid);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("The remaining balance is: " + balance);
			running = false;
		}

	}

}
