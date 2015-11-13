package Section5_AbstractAndNestedClasses;

import java.util.Date;

public class Section5_26_PrincipleObject extends Section5_26_PersonObject {
	private Date mJoinDate; //Thd date the principle joined the school

	public Section5_26_PrincipleObject(String personName, String personBirthDate, Date joinDate) {
		super(personName, personBirthDate);
		mJoinDate = joinDate;
	}

	@Override
	public void printInfo() {
		
		System.out.println("Im a principle object!!!");
		
	}
	}
