package PrefixSum.Common_Operations;

import java.util.HashMap;

public class HowManySubarraySumToK {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 10 };
		int k = 12;

		// This Is The Sum Where we need to use HashMap

		HashMap<Integer, Integer> map = new HashMap<>();

		// This First Step is Crucial not to forgot ie

		map.put(0, 1);
		int sum = 0;
		int count = 0; // To Keep Track of Subarray with sum k

		for (int x : a) {
			sum += x;

			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		if (count == 0) {
			System.out.println("No Array");
		} else {
			System.out.println(count);
		}
	}
}
