package Section7_CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Section7_37_ArrayLists {
public static void main(String[] args) {
	String [] name = {"John", "Bob", "Tray"};
	for (String string : name) {
		System.out.println(string);
	}
		//If we wanted to make this string array  grow, it wouldn't be possible. So use ArrayLists instead..
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("hi");
		items.add("willy");
		items.add("Joey");
		Collections.sort(items);
		for (Object object : items) {
			System.out.println(object);
		}
}
}
