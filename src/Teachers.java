
public class Teacher extends Person {
	private int department;
	private int designation;
	private int salary;
	private int teachingHours;
	private List<Teacher> teachers = new ArrayList<Teacher>();

	public Teacher(int department, int designation, int salary, int teachingHours) {
		this.department = department;
		this.designation = designation;
		this.salary = salary;
		this.teachingHours = teachingHours;
	}

	public int getDepartment() {
		return department;
	}

	public int getDesignation() {
		return designation;
	}

	public int getSalary() {
		return salary;
	}

	public int getTeachingHours() {
		return teachingHours;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public void setDesignation(int designation) {
		this.designation = designation;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setTeachingHours(int teachingHours) {
		this.teachingHours = teachingHours;
	}

	public void DisplayEntry() {
		DisplayPerson();
		System.out.println("Department: " + department);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
		System.out.println("Teaching Hours: " + teachingHours);
	}

	public void addTeacher(InputTeacher())

	{
		teachers.add(entry);
	}

	public void updateTeacher(int Id, InputTeacher())

	{
		teachers.replaceAll(e -> e.getID().equals(ID) ? entry : e);
	}

	public void deleteTeacher(Int ID) {
		teachers.removeIf(entry -> entry.getID().equals(ID));
	}

	public void calculateSalary(SearchID())

	{
		//May id na ako, yung na id na to ituturo yung designation at department


	}

	public void viewAllTeachers() {
		for (Teacher entry : teachers) {
			entry.DisplayEntry();
		}
	}

	public Teachers InputTeachers() {
		System.out.println("Enter the ID of the teacher: ");
		int ID = scanner.nextInt();
		System.out.println("Enter the First Name of the teacher: ");
		String firstName = scanner.next();
		System.out.println("Enter the Last Name of the teacher: ");
		String lastName = scanner.next();
		System.out.println("Enter the Gender of the teacher: ");
		String gender = scanner.next();
		System.out.println("Enter the Phone Number of the teacher: ");
		Long phonenumber = scanner.nextLong();
		System.out.println("Enter the Address of the teacher: ");
		String address = scanner.next();
		System.out.println("1 for Computing 2 for Business \nEnter the department of the teacher: ");
		Int department = scanner.nextInt();
		System.out.println("1 for Head of Faculty 2 for Coordinator 3 for Lecturer \nEnter the designation of the teacher: ");
		Int designation = scanner.nextInt();


		return teachers = new Teachers(ID, firstName, lastName, gender, address, phonenumber, department, designation);
	}

	public int SearchID(Int ID) {
		for (Teacher entry : teachers) {
			if (entry.getID().equals(ID)) {
				return ID;
			}
		}
	}



}
