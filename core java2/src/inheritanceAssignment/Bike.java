package inheritanceAssignment;

public class Bike extends Vehicle {
String bikename	="pulsar";
int discountrate=5000;
int bikeprice=80000;

	void display1()
	{
		System.out.println("name of bike is "+bikename);
		System.out.println("price of bike is "+bikeprice);
		System.out.println("discount rate of bike is "+discountrate);
	}
}
