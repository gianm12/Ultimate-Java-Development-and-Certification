package Section4_OverridingMethodsPolymorphismSaticClasses;

public class Section4_22_SchoolObject {
	private Section4_22_PrincipleObject mPrincipal;
	private Section4_22_TeacherObject[] mTeacher;
	private Section4_22_StudentObject[] mStudent;
	private String SchoolName;
	
	private static Section4_22_SchoolObject  mInstance;
	public Section4_22_SchoolObject()//String //SchoolName)
	{
//		this.SchoolName = SchoolName;
	}

	//the singleton is used when we want to be able to access the same object through multiple methods in another class. Also, it restricts 
		//other instances of the object being made.
	public static Section4_22_SchoolObject getInstance()
	{
		if(mInstance == null)
		{
			mInstance = new Section4_22_SchoolObject();
		}
		return mInstance;
	}
	
	public void setPrincipal(Section4_22_PrincipleObject principal)
	{
		this.mPrincipal= principal;
	}
	protected Section4_22_PrincipleObject getPrincipal()
	{
		return mPrincipal;
	}
	protected String getSchoolName() {
		return SchoolName;
	}

	protected void setSchoolName(String schoolName) {
		this.SchoolName = schoolName;
	}
	

}
