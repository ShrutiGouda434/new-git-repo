import java.util.Scanner;

public class SplitReverse {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		String rev="";
		String sa[]=str.split(" ");
		
		for (int i = 0; i < sa.length; i++) {
			char[] ch=sa[i].toCharArray();
			for (int j = 0; j < ch.length/2; j++) {
				char temp=ch[j];
				ch[j]=ch[ch.length-1-j];
				ch[ch.length-1-j]=temp;
			}
			rev=sa[i]+rev;
		}
		System.out.println(rev);
		
	}

}
