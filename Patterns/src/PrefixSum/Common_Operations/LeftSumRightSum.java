package PrefixSum.Common_Operations;

public class LeftSumRightSum {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		for(int i=1;i<a.length;i++) {
			a[i]=a[i]+a[i-1];
		}

		//We want to calculate the particular index left and right sum let say i=3
		int i=3;
		int left_sum=a[i-1];   //prefix[target_index-1]=left_sum

		//We have two Formula To Find the right_sum
		int right_sum=a[a.length-1]-a[i]; //right_sum=prefix[n-1]-prefix[i]
		int right_sum_alt=sum(i+1,a.length-1,a); //right_sum=> keep start as i+1 and end as end=n

		System.out.println("Left_Sum of Index i="+i+" Is "+left_sum);
		System.out.println("Right_Sum of Index i="+i+" Is "+right_sum);
		System.out.println("Right_Sum of Index i="+i+" Is "+right_sum_alt);

	}

	public static int sum(int start,int end,int[] a) {
		if(start==0) {
			return a[end];
		}else {
			return a[end]-a[start-1];
		}
	}
}
