

public class bignum {

	public static void main(String[] args) {
		int a =args.length;
		int arr[][]=new int[3][3];
		if(a!=9) {
			System.out.println("Please enter the 9 digits");
		}
		else {
			int i,j,n=0;
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					arr[i][j]=Integer.parseInt(args[n]);
					n++;
					
				}
			}
				System.out.println("The given array is");
				for(i=0;i<3;i++) {
					for(j=0;j<3;j++) {
						System.out.print(arr[i][j]+" ");
				
			}
					System.out.println("");
		}
				
			
				int max=0;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				
				if(max<arr[i][j]) {
					max=arr[i][j];
					
				}
				
			}

	}
		System.out.println("The biggest number in array is :" +max);
		

}

}
		
}