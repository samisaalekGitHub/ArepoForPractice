package dec_8;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();

		names.add("name 1");
		names.add("name 2");
		names.add("name 3");
		names.add("name 4");
		names.remove(1);

		System.out.println(names.size());
		System.out.println(names.get(1));
		System.out.println(names);

		for (String n : names) {
			System.out.print("foreach" + n);
		}

		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + ",\t");
		}

	}

}
