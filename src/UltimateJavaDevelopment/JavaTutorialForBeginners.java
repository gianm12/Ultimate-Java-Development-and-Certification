package UltimateJavaDevelopment;

import java.util.Scanner;

public class JavaTutorialForBeginners {

	public static void main(String[] args)
	{
		String hi ="hi";

		gettingUserInput(hi);
		doWhile(hi);
		switchStatement(hi);
		stringArrays(hi);
		
	}
	public static void gettingUserInput(String hi)
	{
		System.out.println("----------------------------------");
		System.out.println("GETTING USER INPUT:");
		//Scanner is the type and System.in is the parameter passed to the Scanner object
		Scanner input = new Scanner(System.in); 

		System.out.println("Enter a line of text: ");
		String line = input.nextLine();
		System.out.println("You entered: " + line);
		System.out.println("----------------------------------");
	}
	public static void doWhile(String hi)
	{
		System.out.println("----------------------------------");
		System.out.println("DOWHILE: ");
		Scanner scanner = new Scanner(System.in);
		int value=0;
		/*
		System.out.println("Enter a number: ");
		int value = scanner.nextInt();

		while(value!= 5)
		{
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		 */
		do{
			System.out.println("Enter a number: ");
			value = scanner.nextInt();

		}
		while(value !=5 );

		System.out.println("Program has ended");


		System.out.println("----------------------------------");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any words: ");
		System.out.println("If you are done type 'exit'.");
		String inputText = input.nextLine();

		//Boolean bol = input.hasNextLine(); // Do this when reading a file document.
		//http://javatutorialhq.com/java/util/scanner-class-tutorial/hasnextline-method-example/
		System.out.println("You entered: " + inputText);
		//for (int i = 0;  input.hasNextLine(); i++) {

		

		while(!inputText.equals("exit"))
		//for(int i =0; !inputText.equals("exit");i++)
		{
			System.out.println("Enter another word...");
			inputText = input.nextLine();
			System.out.println("This is the other word: " + inputText);
		}
			if(inputText.equals("exit"))
			{
				System.out.println("Thank you for using this program. Good bye!");
		}
	}
public static void switchStatement(String hi)
{	
	System.out.println("------------------------------------------------");
	System.out.println("SWITCH STATEMENTS: ");
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the command: ");
	String text = input.nextLine();
	
	switch(text)
	{
	case "start":
		System.out.println("Machine started!");
		break;
	
	case "stop":
		System.out.println("Machine stopped");
		break;
		
	default:
		System.out.println("Command not recognized");
	}
	System.out.println("---------------------------------------------------------");
}
public static void stringArrays(String hi)
{
	String[] words = new String[3];
	words[0]="hello";
	words[1]="to";
	words[2]="you";
	System.out.println(words[2]);
	
	String fruits[]={"apple", "bannana", "pear","kiwi"};
	for(String fruit: fruits)
	{
		System.out.println("These is the fruit: "+ fruit);	
	}

	
	
}



}
