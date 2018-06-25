import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int b=Armstrong(n);
		if (b==n) {
			System.out.println("armstrong number");
		}else
			System.out.println("not armstrong number");

	}
	private static int  Armstrong(int n) {
		int sum=0;
		int p=count(n);
		
		while (n!=0) {
			int r=n%10;
			int pw=power(r,p);
			sum=sum+pw;
			n=n/10;
		}
		System.out.println(sum);
		return sum;
	}
	private static int power(int r, int p) {
		int pr=1;
		while (p!=0) {
			pr=pr*r;
			p--;
		}
		return pr;
	}
	private static int count(int n) {
		int ct=0;

		while (n!=0) {
			int d=n/10;
			ct++;
			n=d;
		}

		return ct;
	}
}
