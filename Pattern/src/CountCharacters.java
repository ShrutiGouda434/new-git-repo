import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
int c[]=new int[128];
for (int i = 0; i <str.length(); i++) {
	char ch=str.charAt(i);
	c[ch]++;
}
for (int i = 0; i < c.length; i++) {
	if (c[i]!=0) {
		System.out.println((char)i+"-----"+c[i]);
	}
}
	}

}
