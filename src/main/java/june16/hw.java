package june16;
import java.util.Scanner;
public class hw {
public static void main(String args[])
{
	int a,i,j,k;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	//b=in.nextInt();
	for(i=0;i<=a;i++)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(k=i;k<=a;k++)
			System.out.print("*");
		System.out.println("\n");
	}
	
	
	//System.out.println("sum of \t"   +a+   "and"   +b+  "is \n"   +c);
}
}
