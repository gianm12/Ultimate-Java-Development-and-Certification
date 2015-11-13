package Section6_InterfacesAndLambdaExpressions;
/*In an interface class, all the methods have to be abstract. 
 * In an abstract class, not all methods have to be abstract.
 * Use interface when there are functions that apply to multiple classes but aren't necessarily related but similar.
 * if the method is related to the type of object, use abstract class. With implements its more generic
 * 
 */
public class Section6_31_InterfaceOrAbstract 
{
	public static void main(String[] args) {
		
	
	Section6_31_Animal animal = new Section6_31_Animal() {

		@Override
		public void walk() {
			System.out.println("animal walk");

		}
	};

	Section6_31_Car car = new Section6_31_Car();

	Section6_31_MyInterfaces[] items = { animal, car };


	for (Section6_31_MyInterfaces item : items) {
		item.doSomething();
	}
	}
}	
