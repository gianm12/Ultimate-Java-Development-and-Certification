package Section3_EncapsulationAndSubclassing;

public class Section3_11_Functions {
	public static void main(String args[])
	{
		System.out.println("FUNCTIONS: ");
		System.out.println("--------------------------");
		int x =10;
		int y =3;
		int add = x+y;
		System.out.println("this is the addition: "+add);
		int mult= 30;
		int multiply = mult(x,y);
		System.out.println("This is the multiplication: " +multiply);
		isNumberPrime(6);
		
	}
	static int mult(int a, int b)
	{
		int mult1 =a*b;
		
		return mult1;
		
	}
	static boolean isNumberPrime(int a)
	{ 
		Boolean bol = false;
		for(int i = 2; i < a;i++)
		{
			if(a%i != 0 && a%a ==0)
			{
				System.out.println(" prime!");
				bol= true;
				return true;	
			}
			else{
				System.out.println("not prime");
				bol=false;
				return false;
			}
		}
		return bol;
//		or.................		
//		if(a%a == 0 && a%2 !=0 && a%3 !=0)
//		{
//			return true;
//		}
//		else{
//			return false;
//		}
	
	}
}
