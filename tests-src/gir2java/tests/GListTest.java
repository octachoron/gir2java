package gir2java.tests;

import generated.glib20.glib.GList;

import java.util.ArrayList;

import org.bridj.Pointer;

public class GListTest {
	
	public static void main(String[] args) {
		// Allocate test data
		Pointer<Integer> test = Pointer.allocateInt();
		test.set(42);
		Pointer<Integer> test2 = Pointer.allocateInt();
		test2.set(39);
		
		// Put the test data on a GList
		Pointer<GList> list = GList.alloc();
		list.as(GList.class).get().glist_field_data(test);
		list = GList.prepend(list, test2);
		
		// See what happened
		long listLength = GList.length(list);
		System.out.println("List length: " + listLength);

		final ArrayList<Integer> results = new ArrayList<Integer>(2);
		for (int n = 0; n < listLength; n++) {
			results.add(GList.nth_data(list, n).as(Integer.class).getInt());
		}
		System.out.println("Contents: " + results.toString());
		
		// Free everything we allocated dynamically
		test.release();
		test2.release();
		GList.free(list);
	}

}
