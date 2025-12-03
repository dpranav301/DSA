package SlidingWindow;

import java.util.HashSet;

public class Dynamic_Window_Size {

	public static void main(String[] args) {

		//This Dynamic WIndow Is Use For Question Where Window Size can be shrink or expand based on condition

		//We want to find Longest Substring with distinct character

		String str="aabcdac";
		int left=0;
		int right=0;
		int maxLen=0;
		HashSet<Character> set=new HashSet<>();
		for(right=0;right<str.length();right++) {

			while(set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(str.charAt(right));
			maxLen=Math.max(maxLen, right-left+1);
		}
		System.out.println(maxLen);

		System.out.println("Left="+left+" Right="+(right-1));
	}
}
