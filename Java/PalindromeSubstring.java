package practice;

import java.util.ArrayList;

public class PalindromeSubstring {

	public static void main(String[] args) {

		String s1 = "abccbc";
		ArrayList<String> subStrings = new ArrayList<>();

		for (int i = 0; i < s1.length(); i++)
			for (int j = i + 1; j <= s1.length(); j++)
				subStrings.add(s1.substring(i, j));
		System.out.println("Substrings are " + subStrings);

		for (int i = 0; i < subStrings.size(); i++) {
			if (checkPalindrome(subStrings.get(i)) == true) {
				System.out.println(subStrings.get(i));
			}
		}
	}

	public static boolean checkPalindrome(String ip) {

		int i = 0, j = ip.length() - 1;
		while (i <= j) {
			if ((ip.charAt(i) == ip.charAt(j))) {
				i++;
				j--;
			} else
				return false;
		}
		return true;
	}

}
