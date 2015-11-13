package Section2_JavaSyntaxAndClassReview;

public class Section2_9_Quiz {
public static void main(String[] args) {
	String lowerCaseString = "this is a very long lower case string";
	firstQuiz(lowerCaseString);
	
	//For fun...
	String originalString ="hello out there world?!";
	
	fun(originalString);
	dynamicCapitalization(originalString);
}


private static String dynamicCapitalization(String originalString) {
	System.out.println("DYNAMIC CAPITALIZATION: ");
	String word ="";
	String[] originalStringArray = originalString.split("\\s");		
	for (int i=0; i<originalStringArray.length; i++) {
		 
		word += originalStringArray[i].substring(0,1).toUpperCase()+ originalStringArray[i].substring(1, originalStringArray[i].length()) + " ";
		//word += originalStringArray[i].substring(0,1).toUpperCase()+ originalStringArray[i].substring(1) + " ";
		
//		System.out.println(word);
	}
	System.out.println(word);
	System.out.println("----------------------------------------------------------------");
	return null;
}

private static String fun(String originalString) 
{
	System.out.println("FUN: ");
	//"hello out there world
	String result = null;
	char H ='H';
	char O = 'O';
	char T = 'T';
	char W = 'W';
	
	result= originalString.replace(originalString.charAt(0),H) + originalString.substring(1, 5) + " " +
			originalString.replace(originalString.charAt(6), O) +  originalString.substring(7, 9) +" "+
			originalString.replace(originalString.charAt(10), T) + originalString.substring(8, 12)+ " "+
			originalString.replace(originalString.charAt(13), W) + originalString.substring(14, originalString.length());
	
	
	String result1 = originalString.substring(0,5).replace(originalString.charAt(0), H) + " " +
					 originalString.substring(6,9).replace(originalString.charAt(6), O) + " " +
					 originalString.substring(10, 16).replace(originalString.charAt(10), T)+ " "+
					 originalString.substring(16,originalString.length()).replace(originalString.charAt(16), W);
	System.out.println("new result: " + result1);
	System.out.println("This is the fun excercise:  "+ result);
	System.out.println("----------------------------------------------------");
	return result1;
}

public static String firstQuiz(String lowerCaseString)
{
	System.out.println("FIRST QUIZ:");
	String question3 = null;
	String ques3= null;
	question3= lowerCaseString.replace("t", "T");
	
	ques3 = lowerCaseString.replaceFirst("t", "T");
	
	System.out.println("Answer to question 3: " + question3);
	System.out.println("Second try: "+ ques3);
	
	//other possible solution:
	if(lowerCaseString.length() > 0)
	{
		lowerCaseString = Character.toUpperCase(lowerCaseString.charAt(0))+ lowerCaseString.substring(1, lowerCaseString.length());
		System.out.println("This is the optional answer: " + lowerCaseString);
	}
	System.out.println("-------------------------------------");
	return ques3;
}

}
