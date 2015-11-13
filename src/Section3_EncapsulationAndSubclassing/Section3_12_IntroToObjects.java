package Section3_EncapsulationAndSubclassing;

public class Section3_12_IntroToObjects {
	public static void main(String[] args) {
	
		String user1 ="Lucy";
		String user2 = "Joey";
		String user3 ="Willy";
		int age1 = 10, age2= 20, age3 = 30;
		
	Section3_12_Object person1 = new Section3_12_Object(user1, age1);
	Section3_12_Object person2 = new Section3_12_Object(user2, age2);
	//making an object array
	Section3_12_Object[] personArray = new Section3_12_Object[3];
	
	for (int i = 0; i < personArray.length; i++) 
	{
		personArray[i] = new Section3_12_Object("Tom" ,i);
	}
	for (int i = 0; i < personArray.length; i++) {
		
		System.out.println(personArray[i].userAge+" " + personArray[i].username);
	}
	
	System.out.println(person1.userAge+" " + person1.username);
	}
	

}
