package logicalExtra;

public class spaces {
public static void main(String[] args) {
	

	
	String s=" Y O G E SH ";
int count=0;
for(int i=0;i<=s.length()-1;i++) {
char a=s.charAt(i);
if(a==' ') {
	count ++;
}
}
System.out.println(count);
}
}