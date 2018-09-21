package interfaceinheritance;

public class Parent implements Child{

	public Parent() {
		// TODO Auto-generated constructor stub
	}
public void Example()
{
	int a;
	System.out.println("in Example class in parent");
	for(a=0;a<10;a++)
		System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		p.Example();

	}

}
