import java.util.Scanner;

public class P1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int n=s.nextInt();
	int k=1;
	for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
			System.out.print(" "+k+++" ");
		}
		System.out.println("");
	}/*
	int st=1;
	int sp=2;
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=sp; j++) {
			System.out.print("   ");
			
		}
		for (int j = 1; j <=st; j++) {
			System.out.print(" * ");
		}
		System.out.println("");
	}*/
}
}
