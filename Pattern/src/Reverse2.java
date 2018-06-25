import java.util.Scanner;

public class Reverse2 {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
String rev="";
/*for (int i = str.length()-1; i >=0; i--) {
	rev=rev+str.charAt(i);
}
System.out.println(rev);
	}*/
for (int i = 0; i <=str.length()-1; i++) {
	char[] ch=str.toCharArray();
	int k=i;
	while (i<=ch.length && ch[i]!=' ') {
		i++;
	}
	int j=i-1;
	while (j>=k) {
		rev=rev+ch[j];
		j--;
	}
	while (i<ch.length) {
		rev=rev+"";
	}
}
System.out.println(rev);


}
}