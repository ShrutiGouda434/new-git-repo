
public class np2 {

	public static void main(String[] args) {
int st=1;
int sp=4;
int n=5;
for (int i = 1; i <=n; i++) {
	for (int j = 1; j <=st; j++) {
		System.out.print(" * ");
	}
	for (int j = 1; j <=sp; j++) {
		System.out.print("   ");
	}
	for (int j = 1; j <=st; j++) {
		System.out.print(" * ");
	}
	if (i<=n/2) {
		sp=sp-2;
		st++;
	}
	else{
		sp=sp+2;
		st--;
	}
	System.out.println("");
}

	}

}
