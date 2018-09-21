package june16;

public class Constructor {
	int a;
	Constructor()
	{
		System.out.println(a+" in default constructor");
	}
	Constructor(int i)
	{
		System.out.println(i);
	}
	public static void main(String args[])
	{
		//if an integer no is added as argument whike creating object parameterized constructor will execute 
		//otherwise default construtor
		//multiplr objects can be created and constructor will also be initialized multiple times
		int s=22;
		Constructor ob=new Constructor();
		Constructor b=new Constructor(ob.a);
		
		
	}

}
