

public class Prime {

	public static void main(String[] args) {
//Scanner s=new Scanner(System.in);
//System.out.println("enter the number");
//int n=s.nextInt();
for (int i = 1; i <=20; i++) {
	printPrime(i);
	//System.out.println();
	
}


	}

	private static void printPrime(int n) {
		int ct=1;
		int i=2;
		while (i<=n) {
			if (n%i==0) {
				ct++;
				
			}
			i++;
		}
		if (ct<=2) {
			System.out.println(n);
		}
		
			
		//System.out.println(n);
	}

}
