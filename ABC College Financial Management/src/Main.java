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
			System.out.print("Enter the number of desired modules (1-6): ");
			totalmodules = sc.nextInt();
			if (totalmodules > 6)
			{
				System.out.println("The maximum allowed modules is 6");
				continue;
			}
			System.out.println("Please select the modules via module number");
			for (int x = 0; x < totalmodules; x++)
			{
				System.out.print(x + 1 + ". Enter here: ");
				selectedmodules[x] = sc.nextInt();
			}
			boolean error = false;
			for (int x = 0; x < totalmodules; x++)
			{
				
				if (selectedmodules[x] > 41)
				{
					System.out.println("Enter a valid module number");
					error = true;
					break;
				}
			}
			if (error == true)
				continue;
			System.out.println(" ");
			System.out.println(" ");
			obj.selectModules(selectedmodules, totalmodules);
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("Enter the number of new modules: ");
			newmods = sc.nextInt();
			System.out.print("Enter the number of repeat modules: ");
			repeatmods = sc.nextInt();
			if (newmods + repeatmods > totalmodules)
			{
				System.out.println("New modules and repeated modules does not match the total modules");
				continue;
			}
			if (repeatmods > 2 && newmods != 0)
			{
				System.out.println("If repeated modules is more than 2, the student is not allowed to take any new modules");
				continue;
			}
			System.out.print("Enter the amount paid: ");
			amountpaid = sc.nextFloat();
			balance = obj.getAmounPaid(amountpaid, newmods, repeatmods);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("The remaining balance is: " + balance);
			running = false;
		}

	}

}
