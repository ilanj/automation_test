package interfaceinheritance;


public class Thismeth extends Sec
{
	

	void demo()
	{
		System.out.println("demo1111111");
	}
	void demo(int c)
	{
		this.demo();
		Sec s1=new Sec();
		s1.demo();
		c=10;
		System.out.println("demo2222222"+c*c*c);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thismeth t=new Thismeth();
		
		
		t.demo();
		t.demo(2);
		
	}

	}

