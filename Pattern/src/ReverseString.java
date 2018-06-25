import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.nextLine();
		String rev="";
		char ch[]=st.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			int k=i;
			while (i>=0&&ch[i]!=' ') {
				i--;
			}int j=i+1;
			while(j<=k){
			rev=rev+ch[j];
			j++;
			}
			if (i>=0) {
				rev=rev+" ";
			}
		}
		System.out.println(rev);
	}

}
