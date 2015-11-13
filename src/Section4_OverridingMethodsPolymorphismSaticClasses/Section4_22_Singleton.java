package Section4_OverridingMethodsPolymorphismSaticClasses;

import java.util.Date;

public class Section4_22_Singleton {
	
public static void main(String[] args) {

	//Section4_22_SchoolObject school = new Section4_22_SchoolObject("UCSD");
	Section4_22_PrincipleObject principal = new Section4_22_PrincipleObject("Jon Smith", "5/20/2000", new Date());
	Section4_22_SchoolObject school= Section4_22_SchoolObject.getInstance();
	school.getSchoolName();
	school.setPrincipal(principal);
	
	school.getPrincipal().getName();
	
}


}
