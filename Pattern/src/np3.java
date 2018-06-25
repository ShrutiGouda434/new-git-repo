
public class np3 {

	public static void main(String[] args) {
int n=5;
int st=5;
int sp=0;
for (int i = 1; i <=n; i++) {
	for (int j = 1; j <=sp; j++) {
		System.out.print("   ");
	}
	for (int j = 1; j <=st; j++) {
		System.out.print(" * ");
	}
	st=st-2;
	sp++;
	System.out.println("");
}



	}

}
