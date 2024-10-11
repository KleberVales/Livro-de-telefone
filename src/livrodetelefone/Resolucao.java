package livrodetelefone;

import java.util.HashMap;
import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		HashMap<String, String> phoneBook = new HashMap<>();
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			phoneBook.put(in.nextLine(), in.nextLine());
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (phoneBook.containsKey(s)) {
				System.out.printf("%s=%s%n", s, phoneBook.get(s));
			} else {
				System.out.println("Not found");
			}
		}
	}
}
