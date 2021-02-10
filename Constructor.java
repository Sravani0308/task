package test;

class Employee
{
	String FirstName;
	String LastName;
	
	
	public String toString()
	{
		return "Employee FirstName=" + FirstName + ", LastName=" + LastName ;
	}
	
	public Employee(String firstName, String lastName) 
	{
		
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	void display()
	{
		
		System.out.println("First Name: "+FirstName);
		System.out.println("Last Name: "+LastName);
	}
}
public class Constructor

{

		public static void main(String[] args)
	{
		Employee emp1=new Employee("Sravani", "Konda");
		Employee emp2=new Employee("Divya", "D");
		Employee emp3=new Employee("ravi  ", "R ");
		emp1.display();
		emp2.display();
		emp3.display();
	}
}