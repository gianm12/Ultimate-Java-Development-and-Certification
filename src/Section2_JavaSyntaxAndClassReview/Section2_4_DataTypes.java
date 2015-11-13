package Section2_JavaSyntaxAndClassReview;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Section2_4_DataTypes {

	public static void main(String [] args)
	{	//Section 2- Java Syntax and Class Review
		//Data types: int, double, boolean, char 
		
		int myInt = 20;//30, 4, 102
		double myDouble = 20.25;//30.1, 50.22222
		int sum = (int) (myInt +myDouble);//40.25 -->40...we are casting 'int'
		int a = 2;
		int b=3;
		int c= a/b; // 2/3 = .6666 --> 0
		int d =b/a;//3/2=1.5 -->1.5
		int f = 20;
		double r =22;
		int result = (int) (f/r); //20/22 = .909 -->0  //had to cast cause can't divide 2 diff data types
		double result1 = f/r; // 20/22 =.909 -->.909 cause its of type double.
		boolean isRainy = true; 
		if(isRainy)
		{	
			System.out.println("you need to bring an umbrella");
		}
		char myChar ='9';//'A' --> converts to number 57 -->  000000001111 ---> number 57 ---> A
		//9 --->number 57 -----> 0000011
		//number 9 --> 00001001
		int mappedVal = (int) myChar;//we are grabbing the char and getting the int value of 57
		System.out.println(myChar);
		System.out.println(mappedVal);
	}
	
	
}
