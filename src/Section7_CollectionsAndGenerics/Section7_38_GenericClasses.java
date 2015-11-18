package Section7_CollectionsAndGenerics;

public class Section7_38_GenericClasses {
public static void main(String[] args) {
	System.out.println("hi");
	Section7_38_OracleArrayList list = new Section7_38_OracleArrayList();
	String[] numbers = {"1", "2","3"};
	//System.out.println("length" +numbers.length);
			for (int i = 0; i < numbers.length; i++) {
				
				list.add(numbers[i]);
				
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
}
}
