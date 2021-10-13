package practice;

import java.util.Scanner;

public class StringCompressions {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();

		System.out.println(compression1(ip));
		System.out.println(compression2(ip));

	}

	public static String compression1(String ip) {
		char temp = ip.charAt(0);
		StringBuilder b = new StringBuilder();
		b.append(temp);
		for (int i = 1; i < ip.length(); i++) {
			if (temp == ip.charAt(i))
				temp = ip.charAt(i);
			else {
				temp = ip.charAt(i);
				b.append(ip.charAt(i));
			}
		}
		return String.valueOf(b);
	}

	public static String compression2(String ip) {
		StringBuilder b = new StringBuilder();
		int count = 0;
		char temp = ip.charAt(0);
		count++;
		for (int i = 1; i < ip.length(); i++) {
			if (temp == ip.charAt(i)) {
				temp = ip.charAt(i);
				count++;
			} else {
				b.append(temp);
				b.append(count);
				temp = ip.charAt(i);
				count = 1;
			}

		}
		return String.valueOf(b);
	}

}
