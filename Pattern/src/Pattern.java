import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
//int k=1;
for (int i =n; i >=0; i--) {
	for (int j = 1; j <=n-i; j++) {
		System.out.print("   ");
	}int k=1;
	for (int j =1 ; j <=2*i-1; j++) {
		//System.out.print(" "+k++%2+" ");
		//System.out.print(" "+j+" ");
		//System.out.print(" "+k+++" ");
		//System.out.print(" "+(char)(i+64)+" ");
		System.out.print(" "+(char)(j%2+96)+" ");
	}
	System.out.println("");
}
	}

}
