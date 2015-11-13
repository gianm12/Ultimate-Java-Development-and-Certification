package Section2_JavaSyntaxAndClassReview;

public class test {
	public static void main(String args[])
	{
		
		String hello= "hello out there world";
		String[] helloArray = null;
		String one = null;
		String two	=null;
		String upperCase = "";
		
		
		helloArray = hello.split("\\s");
		for(int i = 0; i<helloArray.length; i++)
		{	
			
			one = helloArray[i];
			two = one.toUpperCase();
			upperCase += (upperCase = one.replace(one.charAt(0), two.charAt(0))+ " ");
			
			//System.out.print(upperCase + " ");
			//one = one.replaceFirst(one.charAt(0), upperCase)
		
		//	test = test + upperCase+ " ";
		}
			System.out.println("This is the upper case1: "+ upperCase);
		//System.out.print(upperCase + " ");
		
		String upperCase2 = "";
		String[] secondTry= hello.split("\\s");
		for (int i = 0; i < secondTry.length; i++) 
		{
			upperCase2 += secondTry[i].substring(0, 1).toUpperCase() + secondTry[i].substring(1) + " ";
		}
		System.out.println("This is the upper case2: "+ upperCase2);
		
	}
}
