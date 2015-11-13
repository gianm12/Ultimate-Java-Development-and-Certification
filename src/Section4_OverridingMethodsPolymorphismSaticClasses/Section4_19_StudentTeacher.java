package Section4_OverridingMethodsPolymorphismSaticClasses;

public class Section4_19_StudentTeacher extends Section4_19_TeacherObject {
	private String mStudentTeacherSchool;

	public Section4_19_StudentTeacher(String name, String birthDate, String school, double salary,
			int numYearsAtSchool, String studentTeacherSchool) {
		super(name, birthDate, school, salary, numYearsAtSchool);
		mStudentTeacherSchool = studentTeacherSchool;
	}
	
	
	
	
}
