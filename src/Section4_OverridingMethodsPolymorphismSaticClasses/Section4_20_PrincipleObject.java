package Section4_OverridingMethodsPolymorphismSaticClasses;

import java.util.Date;

public class Section4_20_PrincipleObject extends Section4_20_PersonObject {
	private Date mJoinDate; //Thd date the principle joined the school

	public Section4_20_PrincipleObject(String personName, String personBirthDate, Date joinDate) {
		super(personName, personBirthDate);
		mJoinDate = joinDate;
	}

	@Override
	public void doSomething() {
		
		//super.doSomething(); //if i want the see what the output of the parent class is...
		System.out.println("Its a principle object!!!");
	}
	
	

}
