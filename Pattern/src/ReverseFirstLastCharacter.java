import java.util.Scanner;

public class ReverseFirstLastCharacter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.nextLine();
		char ch[]=st.toCharArray();
		for (int i = 0; i <st.length()-1; i++) {
			int k=i;
			while (i<ch.length&&ch[i]!=' ') {
				i++;
			}
			int j=i-1;
			char t=ch[k];
			 ch[k]=ch[j];
			ch[j]=t;
		}
		System.out.println(new String(ch));
	}

}
