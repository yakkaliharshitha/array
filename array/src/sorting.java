

public class sorting {

	public static void main(String[] args) {
	     int a[]= {9,20,10,70,80,65,90};
	     int temp,i,j,n=7;
	     for(i=0;i<n;i++) {
	    	 for(j=0;j<n-i-1;j++) {
	    		 if(a[j]>a[j+1]) {
	    	 temp=a[j];
	    	 a[j]=a[j+1];
	    	 a[j+1]=temp;
	    		 }
	     }

	} 
	System.out.println("after sorting"); 
	for(i=0;i<7;i++) {
		System.out.println(a[i]); 
		
	}
	
	}

}
