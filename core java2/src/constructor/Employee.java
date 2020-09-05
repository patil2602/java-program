/*1)	Create class Employee with constructors (default and parameterized), 
 * methods (1 with return type (calculating salary), 1 without return type (displaying employeedata)).
 * 
 * */

package constructor;

public class Employee {
	String name;
	int id;
	int sal;
	int da,hra;
	//default constructor
	 Employee() 
	{
		name="ganu";
		id=4567;
		sal=40000;
		System.out.println("i am default employee");
	}
	 //parameterized constructor
      Employee(int id,String name,int sal)
	{
	 this.name=name;
	 this.id=id;
	 this.sal=sal;
	System.out.println("i am a parameterized  employee"+name+" "+id+" "+sal);
	}
 int salary() 
	{
		int da,hra,sal;
		hra=40000;
		da=20000;
		sal= hra+da;
	System.out.println("employee salary is"+sal);
		return sal;
	}
 void display()
	{
	 	
		System.out.println("employee name is"+name);
		System.out.println("employee id is" +id);
	    System.out.println("employee salary is" +sal);
	}
}
