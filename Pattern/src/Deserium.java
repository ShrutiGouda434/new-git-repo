import java.util.Scanner;

public class Deserium {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int b=desiriumNumber(n);
if(b==n){
	System.out.println("desirium");
}else
	System.out.println("not desirium");
	}

	private static int desiriumNumber(int n) {
int sum=0;
int ct=count(n);
while (n!=0) {
	int r=n%10;
	int pw=power(r,ct);
	sum=sum+pw;
	n=n/10;
	ct--;
}
return sum;

	}

	private static int power(int r, int ct) {
		int pr=1;
		while (ct!=0) {
			pr=pr*ct;
			ct--;
		}
		return pr;
	}

	private static int count(int n) {
		int ct=0;
		while (n!=0) {
			n=n/10;
			ct++;
		}
		return ct;
	}

}
