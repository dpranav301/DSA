package PrefixSum.Common_Operations;

public class SumBetweenTheIndex {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		for(int i=1;i<a.length;i++) {
			a[i]=a[i]+a[i-1];
		}
		System.out.println(sum(1, 4, a));
	}

	public static int sum(int start,int end,int[] a) {
		if(start==0) {
			return a[end];
		}else {
			return a[end]-a[start-1];
		}
	}
}
