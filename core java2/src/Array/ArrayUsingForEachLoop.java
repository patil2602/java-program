package Array;

import java.util.Scanner;

public class ArrayUsingForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		size = sc.nextInt();

		int array[] = new int[size];

		System.out.println("Enter elements of array: ");
		for(int i = 0; i<array.length;i++)
		{
			array[i] = sc.nextInt();

		}



		for(int i : array)
		{
			System.out.println("ELEMENTS OF ARRAY ARE: "+i);
		}


	}

}
