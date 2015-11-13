package Section3_EncapsulationAndSubclassing;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {

		System.out.println("This is the Quiz for section 3: ");
		question1(1);
		question2(1);

	}
	public static void question1(int x)
	{
		//Write a simple function that returns true if a n integer is negative and false2 if it's positive 
		Scanner in = new Scanner(System.in);
		boolean nextNum	 = true;
		{
			while(nextNum){
				//System.out.println("This is number to be evaluated: " +x);
				System.out.println("Enter a number:(Enter exit to quit) ");
				x = in.nextInt();// could make this a string and then see if its an int of string in a try catch statement.
				
				if(x<0)
				{	
					System.out.println("The number is negative!");
				}	
				else
				{
					System.out.println("The number is positive!");
			
//					System.out.println("Type exit to exit.");
//					String answer = in.nextLine();
//					if(!answer.equals("exit")){
//						nextNum= true;
//					}
//					else {
//						nextNum= false;
//					}
				
				}
				in.nextLine();
				System.out.println("Type exit to exit.");
				String answer = in.nextLine();
				if(!answer.equals("exit")){
					nextNum= true;
				}
				else {
					nextNum= false;
				}
			}
		}
	}


	public static void question2(int x)
	{
		System.out.println("Question 2: ");
		//Create a class that represents a building. Include variables that keep track of the number of people living in the building, the age of 
		//the building, and how much it cost to construct the building. then construct a building obj using a construcotr that take ins the age 
		//age of the building and the number of people living in it.
		int age=30;
		int numOfPeople=1000;
		double costOfBldng=1000;
		String name="FBI";
		Quiz_BuildingObject building = new Quiz_BuildingObject(age,numOfPeople);
		Quiz_GovBuilding govBuilding = new Quiz_GovBuilding(age, numOfPeople, name);
		building.addAge(1);
		System.out.println("In the main class.. this is the new age: " + building.getAge());
		

	
	}
}
