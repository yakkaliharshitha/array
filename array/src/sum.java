

public class sum {

	static void sumrange(int l[], int a,int b) {
		int sum=0;
		boolean add = true;
		for(int i = 0;i<l.length;i++) 
		{
			if(l[i]!=a && add== true) 
				sum=sum+l[i];
			
			else if(l[i]==a) 
				add=false;
			
			else if(l[i]==b) 
				add=true;
		}
			System.out.println(sum);
	}	
		
		public static void main(String[]args) 
		{
			int li[]= {10,12,6,5,4,7,20};
			int a=6;
			int b=7;
			sumrange(li,a,b);
			
		}
		
}

