package interfaceinheritance;

class Calculation{
int z;
public void addition(int x, int y){
z = x+y;
System.out.println("The sum of the given numbers:"+z);
}
public void Substraction(int x,int y){
z = x-y;
System.out.println("The difference between the given numbers:"+z);
}
}
public class My_Calculation extends Calculation{
public void multiplication(int x, int y){
z = x*y;
System.out.println("The product of the given numbers:"+z);
}
public static void main(String args[]){
int a = 20, b = 10;
My_Calculation demo = new My_Calculation();
Calculation c=new Calculation();
//super class obj can only be used to access superclass methods
c.addition(a, b);
c.Substraction(a, b);
demo.multiplication(a, b);
}
}