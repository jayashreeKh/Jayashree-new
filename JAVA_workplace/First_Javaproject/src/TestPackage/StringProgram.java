package TestPackage;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Welcome to Home";
//emoh ot emocleW
String ss="";
for (int i = s.length() - 1; i >= 0; i--) {

	ss = ss + s.charAt(i);
	System.out.print(s.charAt(i));
}
System.out.println();
System.out.println(ss);
StringBuffer sb= new StringBuffer("Welcome to Home");
System.out.println();
sb.reverse();
System.out.println(sb);
System.out.println("============================");
String sss = "Welcome to Codemind";
String sp[] = sss.split(" ");
for (String st:sp)
{
	String s3="";
	for (int i=st.length()-1;i>=0;i--)
	{
		s3=s3+st.charAt(i);
	}
	System.out.print(s3);
	System.out.println(" ");
}}
	

}
