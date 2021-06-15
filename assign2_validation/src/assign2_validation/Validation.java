package assign2_validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validation {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String psw = sc.next();
		validation(psw);
	}

	private static void validation(String psw) {
		int u = 0, l = 0, s = 0, d = 0;
		List<Character> list = new ArrayList<>();
		list.add('#');
		list.add('@');
		list.add('$');
		if(psw.length()>=8) {
		
		for (int i = 0; i < psw.length(); i++) {

			if (Character.isUpperCase(psw.charAt(i))) {
				u++;

			} else if (Character.isLowerCase(psw.charAt(i))) {
				l++;
			} else if (Character.isDigit(psw.charAt(i))) {
				d++;
			} else if (list.contains(psw.charAt(i))) {
				s++;
			}
		}
		}
		else {
			System.out.println("pasword should be 8 characters");
		}
		if (u >= 1 && l >= 1 && d >= 1 && s >= 1) {
			System.out.println("valid");
		} else {
			System.out.println("not valid");

		}
	}
}
