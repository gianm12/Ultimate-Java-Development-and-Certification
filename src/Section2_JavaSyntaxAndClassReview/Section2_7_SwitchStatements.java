package Section2_JavaSyntaxAndClassReview;

public class Section2_7_SwitchStatements {
public static void main(String[] args) {
	
	System.out.println("Switch Statments:");
	
	switch(3)
	{
	case 4:
		System.out.println("we are now inside case 1");
		break;
	case 3:
		System.out.println("we are in case 2");
		//break;//if break isnt here it stops checking conditions, it would just jump to case 3
	case 5:
		System.out.println("we are in case 3");
	default:
		break;
	}
}

}
