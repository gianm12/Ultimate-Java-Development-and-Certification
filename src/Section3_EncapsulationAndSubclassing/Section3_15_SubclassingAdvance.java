package Section3_EncapsulationAndSubclassing;

public class Section3_15_SubclassingAdvance {
	public static void main(String[] args) {
//		
//		Section3_14_StudentObject student1 = new Section3_14_StudentObject("Willy", "May 20, 2000", "4.0");
//		student1.printInfo();
//		
//		Section3_14_PersonObject person1= new Section3_14_PersonObject("Joey","March 20l 1900");
//		person1.printInfo();
		Section3_15_TeacherObject teacher1 = new Section3_15_TeacherObject("Sally", "March 1, 1990","UCSD", 90000);
		teacher1.printInfo();
		
		Section3_15_TeacherObject teacher2 = new Section3_15_TeacherObject("Willy", "May 20, 2000", "UCLA", 90000);
		teacher2.printInfo();
		
		Section3_15_StudentObject student1 = new Section3_15_StudentObject("Willy", "May 20, 2000", "4.0");
		student1.printInfo();
		
		Section3_15_PersonObject[] myPersonArray =
			{
					new Section3_15_StudentObject("Willy", "May 20, 2000", "4.0"),
					new Section3_15_TeacherObject("Willy", "May 20, 2000", "UCLA", 90000)
			};
		for (int i = 0; i < myPersonArray.length; i++) {
			System.out.println("in the for loop!");
			myPersonArray[i].printInfo();
		}
		
	}

}
