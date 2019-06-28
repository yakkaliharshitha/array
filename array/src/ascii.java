

public class ascii {

	public static void main(String[] args) {
		int n[]= {65,120,80,117};
		String s = null;
		for(int i: n) {
			s=Character.toString((char)i);
            System.out.print(s + " ");
		}
		
		}
}
