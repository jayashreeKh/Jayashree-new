package ProgramsByMe;

public class OccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1="Codemind";
		int count = 0;
		for(int i=0;i<S1.length();i++)
		{
			if(S1.charAt(i)=='d')
			{
				count++;
			}
			}
		System.out.println("The occurrence of d:" +count);
			
	}}
	
	
	
