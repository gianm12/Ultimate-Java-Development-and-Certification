package Section2_JavaSyntaxAndClassReview;

import java.util.Arrays;

public class Section2_8_Arrays {
	public static void main(String[] args) {

		
		
		System.out.println("Arrays: \n");
		
		int[] myArray = new int[5]; //[0], [0], [0]..100 blocks of memory
		myArray[0]=20;
		myArray[1] = 30;
		myArray[2] = 2;
		myArray[3] = 4;
		myArray[4] = 50;
		int[] test = {1 , 3,2};
		int addition =0;
		System.out.println("Lenght of array " +myArray.length);
		for (int i = 0; i < myArray.length; i++) 
		{
			addition += myArray[i];//addition = addition + myArray[i]
			System.out.println("iterating through array: "+myArray[i]);
		}
		Arrays.sort(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Sorted array: "+myArray[i]);
		}
		System.out.println("The addition of the array: "+addition);
		
		String[] names ={"Joey", "Sam","Gordis"};
		
		for (int i = 0; i < names.length; i++) 
		{
		
			System.out.println("Iterating through names array: "+names[i]);	
		}
		System.out.println("----------------------------");
		for (String name : names) // When using the for each loop it iterates through the 'names' array and 
			//stores each iteration in the string 'name' which you are printing out inside the loop.
		{ 
			System.out.println("Doing the same thing as above: "+name);
		}
		
	}

}
