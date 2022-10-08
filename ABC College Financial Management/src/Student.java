
public class Student extends Persons
{
	public int numberOfModules, numberOfRepeatedModules;
	public double amountPaid;
	String[] modules = 
		{
			"Introduction to Computing", "Computer Programming 1", "Introduction to Human Computer Interaction",
			"Computer Programming 2", "Data Structures and Algorithm", "Professional Development",
			"Discrete Structures 1", "Computer Systems and Architecture", "Discrete Structures 2",
			"Object Oriented Programming", "Information Management", "Design Thinking", "Algorithm",
			"Fundamentals of Analaysis", "Operating System", "Application Development of Emerging Technologies",
			"Technoprenuership", "Database Systems", "Networks and Communications 1", "Automata Theory",
			"CS Specialization 1", "CS Elective Parallel and Distributive Computing", "Mobile Programming", "Networks and Communcations 2",
			"Modeling and Simulation", "Software Engineering 1", "CS ELective Computer Graphics and Visual Computing",
			"CS Specialization 2", "CS Project Management", "Software Engineering 2", "Programming Languages",
			"CS Specialization 3", "Number Theory", "Information Assurance and Security", "CS Project 1",
			"CS Specialization 4", "Social Issues and Professional Practice", "CS Project 2", "CS Elective Intelligent Systems",
			"Internship 1", "Internship 2"
		};
	int totalModules = modules.length;
	String[] selectedMods = new String[6];
	int newMods, repeatMods, numberofModules;
	float amoundPaid;
	float balance, totalAmount, subTotal1, subTotal2;
	public void displayModules()
	{
		for (int x = 0; x < totalModules; x++)
		{
			if (x % 5 == 0)
			{
				System.out.println("");
			}
			if (modules[x].length() > 16 )
			{
				System.out.print(x+1 + ". ");
				for (int y = 0; y < 16; y++)
				{
					System.out.print(modules[x].charAt(y));
				}
				System.out.print("\t\t");
			}
			else if (modules[x].length() < 11)
			{
				System.out.print(x+1 + ". ");
				for (int y = 0; y < modules[x].length(); y++)
				{
					System.out.print(modules[x].charAt(y));
				}
				System.out.print("\t\t\t");
			}
			else 
			{
				System.out.print(x+1 + ". " + modules[x] + "\t\t");
			}
			
		}
	}
	
	public void selectModules(int[] selectedModules, int numberofModules)
	{
		this.numberofModules = numberofModules;
		
		//reduce the value of the numbers in the selectedModules by 1 to be equivalent with the element number of the modules array
		for (int x = 0; x < numberofModules; x++)
		{
			selectedModules[x] -= 1;
		}
		
		//get the selected modules from the modules array
		int z = 0;
		for (int x = 0; x < totalModules; x++)
		{
			for (int y = 0; y < numberofModules; y++)
			{
				if (x == selectedModules[y])
				{
					selectedMods[z] = modules[x];
					z++;
				}
			}
		}
		
		//display the selectedMods
		for (int x = 0; x < numberofModules; x++)
		{
			System.out.println(x+1 + ". " + selectedMods[x]);
		}
	}
	
	public float getAmounPaid(float amount, int newModules, int repeatModules)
	{
		this.newMods = newModules;
		this.repeatMods = repeatModules;
		this.amountPaid = amount;
		
		subTotal1 = 525 * newMods;
		subTotal2 = 110 * repeatMods;
		totalAmount = subTotal1 + subTotal2;
		
		balance = (float) (totalAmount - amountPaid);
		return balance;
	}
}

/*
 * Number of Modules A selection of new subjects for the current semester. The tuition fee for each module is PHP 525. E.g. a 
 * student taking 5 modules will have to pay 5 x 525 = 2625 Pesos. The tuition fee for each repeated module is 110.
*/