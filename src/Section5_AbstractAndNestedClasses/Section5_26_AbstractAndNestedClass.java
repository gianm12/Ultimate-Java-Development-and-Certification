package Section5_AbstractAndNestedClasses;

import java.sql.Date;

public class Section5_26_AbstractAndNestedClass {
	
	public static void main(String[] args) {

		Section5_26_PersonObject person = new Section5_26_PersonObject("name", "birthdate") {
			
			@Override
			public void printInfo() {
				System.out.println("this is person!");
				// TODO Auto-generated method stub
				
			}
		};
		
		person.printInfo();
		
		Section5_26_PrincipleObject principal = new Section5_26_PrincipleObject("bob", "date", new Date(0));
		
		
	}

}
