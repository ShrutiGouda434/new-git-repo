import java.util.Scanner;

public class CountAlphabets {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String st=s.nextLine();
int c[]=new int[26];
char ch[]=st.toCharArray();
for (int i = 0; i <st.length(); i++) {
	if (ch[i]>=65&&ch[i]<=90) {
		c[ch[i]-65]++;
	} else if (ch[i]>=97&&ch[i]<=122) {
		c[ch[i]-97]++;
	}
	
	
}
for (int j = 0; j < c.length; j++) {
	if (c[j]!=0) {
		System.out.println((char)(65+j)+"----"+c[j]);
	}
}
	}

}
