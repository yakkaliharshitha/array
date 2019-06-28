

public class reversearray {

	public static void main(String[] args) {
	int i=0,j;
	int a=args.length;
	int arr[][]=new int[4][4];
	for(i=0;i<3;i++) {
		}
	if(a!=4&&a<4) {
		System.out.println("Please enter the 4 digits");
	}
	
	if(a==4) {
		int n=0;
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				arr[i][j]=Integer.parseInt(args[n]);
				n=n+1;}
		}
		System.out.println("The given  array is");
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				
				System.out.print(arr[i][j]+  "  ");
				}
			System.out.println(" ");
				
			}
		System.out.print("The reversed array is ");
		for(i=1;i>=0;i--) {
			for(j=1;j>=0;j--) {
		System.out.print(arr[i][j]+ " ");
			
		}
		
			System.out.println(" ");
	}
	

	}


}
}