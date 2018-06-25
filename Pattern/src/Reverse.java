import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
String sa[]=str.split(" ");
String temp=sa[0];
sa[0]=sa[sa.length-1];
sa[sa.length-1]=temp;
String st="";
for (int i = 0; i < sa.length; i++) {
	st=st+sa[i]+" ";

}
System.out.println(st);

	}

}
