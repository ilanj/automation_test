package interfaceinheritance;

public class Parent1{

	public Parent1() {
		// TODO Auto-generated constructor stub
	}
public void Example()
{
	int a;
	System.out.println("in Example class in parent1");
	for(a=0;a<10;a++)
		System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p=new Parent1();
		p.Example();

	}

}
