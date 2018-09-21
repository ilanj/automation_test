package interfaceinheritance;

public class Thiskey {
int a=1100;
void keydemo()
{
	int a=110;
System.out.println(a);
System.out.println(this.a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskey t=new Thiskey();
		t.keydemo();

	}

}
