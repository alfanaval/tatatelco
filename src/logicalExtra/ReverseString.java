package logicalExtra;

public class ReverseString {
public static void main(String[] args) {
	/*StringBuilder s=new StringBuilder("YOGESH");
	System.out.println(s.reverse());*/
String s="PRATHM";
String rev=" ";
for (int i=s.length()-1;i>=0;i--){
	//rev=s.charAt(i)+rev;
	rev=rev+s.charAt(i);
}
System.out.println(rev);
}
}
