import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter row number");
		int r=s.nextInt();
		System.out.println("enter start number");
		int st=s.nextInt();
		printPattern(r,st);
	}

	private static void printPattern(int r, int st) {
for (int i =1 ; i <=r; i++) {
	for (int j = 1; j <=i; j++) {
		System.out.print(st);
		
	}
	st++;
	System.out.println("");
}
//for (int i = r-1; i >=1; i--) {
st--;
for (int i = r; i >=1; i--) {
	
	for (int j = 1; j <=i; j++) {
		
		System.out.print(st);
		
	}
	st--;
	System.out.println("");
	
}
	}

}
