package TestPackage;

class A
{
	void EvenOdd()
	{
		System.out.println("Even no. are: ");

		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}

		System.out.println("Odd no. are: ");
		int j=1;
		while(j<=10)
		{
			if(j%2!=0)
			{
				System.out.println(j);
			}
			j++;
		}
	}
}
public class WhileloopEvenOdd{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.EvenOdd();
	}

}