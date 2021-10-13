package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimeFromArraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ip = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			ip.add(sc.nextInt());
		}
		for (int i = ip.size() - 1; i >= 0; i--) {
			if (isPrime(ip.get(i))) {
				ip.remove(i);
			}
		}
		System.out.println(ip);
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}
}
