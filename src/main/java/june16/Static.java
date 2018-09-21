package june16;

class Static {
	static final int a=10;
	void met()
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		Static obj=new Static();
		//a=10;
		obj.met();
		Seco obj1=new Seco();
		obj1.ex();
		System.out.println(a);
	}

}
class Seco
{
	void ex()
	{
		
		System.out.println(Static.a);
	}
}