package Section4_OverridingMethodsPolymorphismSaticClasses;

public class Section4_19_FinalModifier {
	public static void main(String[] args) {


		Section4_19_TeacherObject sally = new Section4_19_TeacherObject("sally", "5/20/2000", "UCLA", 50000, 10);
		System.out.println(sally.getSalary());
		
		Section4_19_StudentTeacher mikey = new Section4_19_StudentTeacher("Mikey", "05/20/2000", "ucla", 2000, 1, "UC Davis");
		System.out.println(mikey.getSalary());
		mikey.printInfo();
	}
}
