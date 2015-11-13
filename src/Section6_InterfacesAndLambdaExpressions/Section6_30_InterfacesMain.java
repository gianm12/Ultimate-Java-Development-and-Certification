package Section6_InterfacesAndLambdaExpressions;

import java.util.Iterator;

/*Can only store method headers
 * You can implement multiple interfaces
 * It is useful when a class can't inherit a class, so this is  another way of sub-classing a class
 */
public class Section6_30_InterfacesMain {
public static void main(String[] args) {
	Section6_30_Animal animal = new Section6_30_Animal();
	Section6_30_Car car = new Section6_30_Car();
	//because animal and car are of the same type (MyInterface) we can store them in an arrray of that type.
	Section6_30_MyInterfaces[] items =
		{
				animal, car
		};
	for (Section6_30_MyInterfaces item : items) {
		item.doSomething();
	}
	
}
}
