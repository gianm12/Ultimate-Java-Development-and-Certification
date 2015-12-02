package Section7_CollectionsAndGenerics;

public class Section7_38_GenericClasses {
public static void main(String[] args) {
	
	Section7_38_OracleArrayList<Integer> list = new Section7_38_OracleArrayList();
	String[] numbers = {"1", "2","3"};

			for (int i = 0; i < 30; i++) {
				
				//list.add(numbers[i]);
				list.add(i);
				
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
}
}
