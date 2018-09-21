package june16;

public class Helloworld {
static int age=58;
int a=34;
int b=45;
int d;
public void add()
{
int c=a+b;
System.out.println(c);
System.out.println(d);
System.out.println(d);
System.out.println(age++);
}
int add1()
{

int c=a+b;
System.out.println(age++);
return c;
}

void add(int y, int z)
{
a=y;
b=z;
System.out.println(a+b);
System.out.println(age++);
}
int add1(int y, int z)
{
a=y;

System.out.println(age++);
b=z;
return a-b;


}
public static void main(String[]args)
{
//CN ON=new CN();
	System.out.println(age++);
Helloworld hw=new Helloworld();
Sec obj=new Sec();
hw.add();
System.out.println(hw.add1(23, 45));
hw.add();
obj.two();

}
}
class Sec
{
	void two()
	{
	System.out.println(Helloworld.age*100);
}
}