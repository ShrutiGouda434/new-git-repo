import java.util.Scanner;

public class Pdiamond {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		printDiamond(n);
	}

	private static void printDiamond(int n) {
		/*for (int i = 1; i <=n; i++) {
	for (int j = 1; j <=n-i; j++) {
		System.out.print("   ");
	}
	for (int j = 1; j <=2*i-1; j++) {
		System.out.print(" * ");
	}
	System.out.println("");
}
for (int i = n-1; i >=1; i--) {
	for (int j = 1; j <=n-i; j++) {
		System.out.print("   ");
	}
	for (int j = 1; j <=2*i-1; j++) {
		System.out.print(" * ");
	}
	System.out.println("");
}*/int sp=n/2;int st=1;
for (int i = 1; i <=n; i++) {
	for (int j = 1; j <=sp; j++) {
		System.out.print("   ");
	}
	for (int j = 1; j <=st; j++) {
		
		System.out.print(" * ");
	}
	if (i<=n/2) {
		sp--;
		st=st+2;
	} else {
		sp++;
		st=st-2;
	}
	System.out.println("");	
}
	}

}
