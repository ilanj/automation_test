package interfaceinheritance;

class Sec
{
	Sec()
	{
		System.out.println("seccond clas constructor");
	}
	void demo()
	{
		System.out.println("demo from seond class");
	}
	
	public static void main(String args[])
	{
		Sec s=new Sec();
		s.demo();
	}
}

