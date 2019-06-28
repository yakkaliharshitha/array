

public class sumavgarray {

	public static void main(String[] args) {
		int a[]= {20,40,60,80};
		int sum=0,i;
		float avg;
		for(i=0;i<=3;i++) {
			sum=sum+a[i];
			}
		avg=sum/4;
		System.out.println("the sum of array is "+sum);
		System.out.println("the avg of array is "+avg);


	}

}
