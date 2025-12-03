package PrefixSum;

import java.util.Arrays;

public class PrefixSumWithDiffArray {

	public static void main(String[] args) {
		 int[] a= {1,2,3,4,5,6};
		 int[] prefix=new int[a.length];

		 //Very Imp step whenever declare new array
		 prefix[0]=a[0];


		 for(int i=1;i<a.length;i++) {
			prefix[i]=prefix[i-1]+a[i];
		 }
		 System.out.println(Arrays.toString(prefix));
	}
}
