import java.util.Scanner;

public class d1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int sp=n/2;
		int st=1;
		int k=1;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=sp; j++) {
				System.out.print("   ");
			}
			for (int j = 1; j <=st; j++) {
				//System.out.print(" * ");
				//System.out.print(" "+(char)(i+64)+" ");
				//System.out.print(" "+k+++" ");
				//System.out.print(" "+j%2+" ");
				if (j%2==1) {
					System.out.print(" * ");
				} else {
					System.out.print(" "+k+++" ");

				}
				
			}
			if (i<=sp) {
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
