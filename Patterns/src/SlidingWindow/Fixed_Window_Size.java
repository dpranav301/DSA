package SlidingWindow;

public class Fixed_Window_Size {

	public static void main(String[] args) {
		//Sliding Window with fix size can be use to find out subarray with window size k with max_sum
		int[] a= {1,2,3,4,5,6,7};
		int k=3;


		int max_win_sum=0;
		int curr_win_sum=0;

		//Find Sum of First Window
		for(int i=0;i<k;i++) {
			curr_win_sum+=a[i];
		}


		//Assign Sum into max_win_sum
		max_win_sum=curr_win_sum;

		for(int i=k;i<a.length;i++) {
			curr_win_sum+=a[i]-a[i-k];
			max_win_sum=Math.max(max_win_sum, curr_win_sum);
		}

		System.out.println(max_win_sum);


	}
}
