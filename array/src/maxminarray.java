

public class maxminarray {

	public static void main(String[] args) {
		int a[]= {20,40,60,80,100};
		int i,max=a[0],min=a[0];
		for(i=0;i<=4;i++) {
			if(a[i]>=max) {
				max=a[i];
				 }
			
			if(a[i]<=min) {
				min=a[i];	
				
			}}
			System.out.println("The maximum value in array is "+max);
			System.out.println("The minimum value in array is "+min);
		
			
		}

	}


