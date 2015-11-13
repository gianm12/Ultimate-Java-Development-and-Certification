package Section5_AbstractAndNestedClasses;
/*Learning points:
We can have a class within a class. 
*/
public class Section5_27_NestedClasses {
	public static void main(String[] args) {
		
		Section5_27_TeacherObject smith = new Section5_27_TeacherObject("Smith", "may", "union", 50000, 5);
		
		Section5_27_TeacherObject.Subject subject = new Section5_27_TeacherObject.Subject("EE");
		
		smith.setSubject(subject);
		System.out.println(smith.getSubject().getSubjectName());
		
		
	}

}
