package easy;

import java.util.HashMap;

//program to return index of array elements which sum is equal to target
public class TwoSum {

	public static int[] getSolution(int nums[], int target) {
		HashMap<Integer, Integer> visitedNums = new HashMap<Integer, Integer>();
		int soln[] = { -1, -1 };
		for (int i = 0; i < nums.length; i++) {
			int val = target - nums[i];
			if (visitedNums.containsKey(val)) {
				soln[0] = i;
				soln[1] = visitedNums.get(val);
			} else
				visitedNums.put(nums[i], i);

		}
		return soln;

	}
	public static void main(String args[]) {
		int nums[] = { 4, 1, 2, 5, 6, 7, 8, 9 };
		int target = 12;
		int soln[] = getSolution(nums, target);
		System.out.println(soln[0] + " " + soln[1]);

	}

}
