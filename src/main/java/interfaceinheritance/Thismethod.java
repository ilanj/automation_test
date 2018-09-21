package interfaceinheritance;

public class Thismethod{
	//Instance variable num
	int num=10;
	Thismethod(){
	System.out.println("This is an example program on keyword this ");
	System.out.println("value of instance/class var num in default constructor "+this.num);
	}
	Thismethod(int num){
	//Invoking the default constructor
		this();
		//Assigning the value 30 passed from main to this instance var
		this.num=num;
		System.out.println("value of instance/class var num in parameterized constructor "+this.num);
		}
		public void greet(){
		System.out.println("Hi Welcome to Tutorialspoint");
		}
		public void print(){
		//Local variable num
		int num=20;
		//Printing the instance variable
		System.out.println("value of local variable num is : "+num);
		//Printing the local variable
		System.out.println("value of instance variable num is : "+this.num);
		//Invoking the greet method of a class
		this.greet();
		}
		public static void main(String[] args)
		{
		//Instantiating the class
		Thismethod obj1=new Thismethod();
		//Invoking the print method
		obj1.print();
		//Passing a new value to the num variable through parametrized constructor
		Thismethod obj2=new Thismethod(30);
		//Invoking the print method again
		obj2.print();
		}
		}