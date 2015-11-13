package Section3_EncapsulationAndSubclassing;

public class Section3_15_PersonObject {

		private String name, birthDate;
		
		public Section3_15_PersonObject(String personName, String personBirthDate)
		{
			name = personName;
			birthDate= personBirthDate;
		}

		public void printInfo()
		{
			System.out.println("I am a person" + " and my birth date is:  " + birthDate);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}
		
		
		
	}

