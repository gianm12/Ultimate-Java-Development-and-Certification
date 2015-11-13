package Section3_EncapsulationAndSubclassing;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Section3_14_PersonObject {
	String name, birthDate;
	
	public Section3_14_PersonObject(String personName, String personBirthDate)
	{
		name = personName;
		birthDate= personBirthDate;
	}

	public void printInfo()
	{
		System.out.println("I am a person" + " and my birth date is:  " + birthDate);
	}
}
