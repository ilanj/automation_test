package june16;

class Instance1 {
	final int a=10;
	void met()
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		Instance1 obj=new Instance1();
		int c=obj.a;
		obj.met();
	}

}
