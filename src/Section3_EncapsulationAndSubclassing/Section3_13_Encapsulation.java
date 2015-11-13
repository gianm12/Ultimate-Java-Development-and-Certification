package Section3_EncapsulationAndSubclassing;

public class Section3_13_Encapsulation {
	public static void main(String[] args) {

		String user1 ="Lucy";
		String user2 = "Joey";
		String user3 ="Willy";
		int age1 = 10, age2= 20, age3 = 30;

		Section3_13_Object person1 = new Section3_13_Object(user1, "pass1", age1);
		
		Section3_13_Object person2 = new Section3_13_Object(user2, "pass2", age2);
		//making an object array
		Section3_13_Object[] personArray = new Section3_13_Object[3];

		//for (int i = 0; i < personArray.length; i++) 
		//{
		//	personArray[i] = new Section3_13_Object("Tom" ,i);
		//}
		//for (int i = 0; i < personArray.length; i++) {
		//	
		//	System.out.println(personArray[i].userAge+" " + personArray[i].username);
		//}
		//System.out.println(person1.userAge+" " + person1.username);


		person1.setMoney(100, "pass1");
		person2.setMoney(5, "pass2");
		System.out.println("This is the set money in Main: " +person1.getMoney());
		person1.addMoney(5,"pass1");

		System.out.println("This is the added money in Main: "+ person1.getMoney());
		
		

	}
}
