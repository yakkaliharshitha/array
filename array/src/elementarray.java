

public class elementarray {

	public static void main(String[] args) {
	int a[]= {20,30,40,50,60,70,80};
	int i,n=a[0];
	boolean y=false;
	n=Integer.parseInt(args[0]);
	for(i=0;i<=6;i++) {
		if(n==a[i]) {
		y=true;
		System.out.println("the element found and the position is " +i);
		}}
	if(y) {
	System.out.println("");
	}
	else {
		System.out.println("-1");	
	}
	}

}
