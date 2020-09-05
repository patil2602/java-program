package constructor;

//import java.util.Scanner;

public class EmployeeMain {
	

	public static void main(String[] args, int sal, int id) {
		// TODO Auto-generated method stub
		
		/*Scanner sca = new Scanner(System.in);
	
		System.out.println("enter a name");
		String name= sca.next();
		
		System.out.println("enter a id");
		int id= sca.nextInt();*/
	
		
		
		Employee emp = new Employee();
		emp.salary();
		emp.display();
		
		Employee emp1=new Employee(2454,"monal",50000);
		emp1.salary();
		emp1.display();
		
		
	}

}
