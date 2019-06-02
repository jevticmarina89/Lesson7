package examples;

import java.util.ArrayList;
import java.util.Arrays;

public class BetterArrayList extends ArrayList<Object> {

	public void pop() {
		if (!(isEmpty())) {
			remove(size() - 1);
		}
	}

	public void print() {
		System.out.println(Arrays.toString(toArray()));
	}

	public static void main(String[] args) {

		BetterArrayList words = new BetterArrayList();
		words.add("abc");
		words.add("def");
		words.add("ghi");
		words.add("jkl");
		words.add("mno");
		words.add("pqr");

		words.pop();
		words.print();

	}

}
