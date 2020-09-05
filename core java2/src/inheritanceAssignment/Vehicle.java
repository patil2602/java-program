/*2)	Define a class named Vehicle as described below:
i)	Data Members:
a.	vehicle name
b.	vehicle model number
c.	vehicle price
d.	service station name
ii)	Methods:
a.	Constructor
b.	Display() method to display all the details of class Vehicle .
iii)	Define another class named Bike that extends the class Vehicle.
a.	Data Members: discountRate
b.	Constructor
c.	Methods:display() to display bike name,bike model number,bike price,service station name,discount rate.
iv)	Discount() method to compute the discount.
v)	Create an object for the class Bike and test it.
1.
*/
package inheritanceAssignment;

public class Vehicle { 
	String vehiclename="car";
	int vehiclemodel=2234;
	int vehicleprice=800000;
	void display()
	{
		System.out.println("the name of vehicle:"+vehiclename); 
		System.out.println("the model of vehicle:"+vehiclemodel); 
		System.out.println("the price of vehicle:"+vehicleprice); 
		
	}
}
