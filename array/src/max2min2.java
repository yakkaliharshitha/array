

public class max2min2 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,100};
		int i,j,b;
		int max=a[0],min=a[0];
		for(i=0;i<=6;i++) {
			
			if(a[i]>=max) {
				max=a[i];
				
				}
			if(a[i]<=min) {
				min=a[i];
				
				}}
		
		for(i=0;i<6;i++) {
			for(j=i+1;j<6;j++) {
				if(a[i]<a[j]) {
					b=a[i];
					a[i]=a[j];
					a[j]=b;
					
				}
				
			}
		}
		
		
		System.out.println("The first maximum numbers in array are "+max );
		System.out.println("The second maximum numbers in array are "+a[0] );
		
		System.out.println("The first minimum numbers in array are "+min);
		System.out.println("The second minimum numbers in array are "+a[4]);
		
			
		}

	}


