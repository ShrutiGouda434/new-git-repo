import java.util.Scanner;

public class CountCharacters2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		/*int c[]=new int[128];
		for (int i = 0; i <str.length()-1; i++) {
			char ch=str.charAt(i);
			c[ch]++;
					
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i]!=0) {
				System.out.println((char)i+"----"+c[i]);
			}
		}*/
		int c[]=new int[26];
		for (int i = 0; i <str.length()-1; i++) {
			char ch[]=str.toCharArray();
			if (ch[i]>=65&&ch[i]<=90) {
				c[ch[i]-65]++;
			}
			else if (ch[i]>=97&&ch[i]<=122) {
				c[ch[i]-97]++;
			}
					}
		for (int i = 0; i < c.length; i++) {
			if (c[i]!=0) {
				System.out.println((char)(i+64)+"---"+c[i]);
			}
		}
	}

}
