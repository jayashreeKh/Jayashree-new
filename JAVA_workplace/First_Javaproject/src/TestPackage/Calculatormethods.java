package TestPackage;

public class Calculatormethods {

	public static void main(String[] args) {
		
method calc=new method();
calc.addition(2, 3);
calc.substraction(90,80);
calc.division(2, 1);
calc.multiplication(5, 2);

	}

}
class method{
		
	void addition(int a, int b)
	{
		int add=a+b;
		System.out.println("Addition=>"+add);
	}
	void substraction(int x, int y)
	{
		int z=x-y;
		System.out.println("Substraction=>"+z);
	}
	int multiplication ( int p, int q)
	{
		int r =p*q;
		System.out.println("Multiplication=>"+r);
		return r;
	}
	float division(int m, int n)
	{
	float f=m/n;
	System.out.println("Division=>"+f);
	return f;
	}
}