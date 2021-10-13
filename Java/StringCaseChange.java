//Ascii based converter
import java.util.Scanner;

public class StringCaseChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		System.out.println(changeCase(ip));
		sc.close();

	}

	public static String changeCase(String ip) {
		StringBuilder b = new StringBuilder(ip);
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z') {
				b.setCharAt(i, (char) (b.charAt(i) - 32));
			} else if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z') {
					b.setCharAt(i, (char) (b.charAt(i) + 32));
			}
		}
		return String.valueOf(b);
	}

}

