package TestPackage;
class Operators
{
	void unaryIncreamentmethod()
	{
		int a=30;
		System.out.println("Prefix value of "+ ++a);
		System.out.println("Postfix value of " + a++);
		System.out.println(" value of a" +a);
	}
	void unarydecreamentmethod()

	{
		int b=40;
		System.out.println("Prefixoperator-"+ --b);
		System.out.println("Postfixoperator-"+ b--);
		System.out.println("Postfixoperator-"+-- b);
	}
	
}

public class Operatorsexample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Operators op = new Operators();
		//Operators op1=new Operators();
        op.unaryIncreamentmethod();
		op.unarydecreamentmethod();
	}

}
