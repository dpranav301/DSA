 package PrefixSum;

import java.util.Arrays;

public class PrefixSumWithSameArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		for(int i=1;i<a.length;i++) {
			a[i]=a[i-1]+a[i];
		}
		System.out.println(Arrays.toString(a));
	}
}
