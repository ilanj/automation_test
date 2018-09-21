package selenium;
import java.util.Scanner;
public class Str {
	//int length=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=0,i;
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String rev="";
		try {
			for(length=0;s1.charAt(length)!='\0';length++)
			{
				
			}
		}
		
catch(Exception e)
		{
	
		}
		System.out.println("string length is"+length);
		for(i=0;i<length;i++)
		{
			rev=s1.charAt(i)+rev;
		}
		System.out.println("reversed string is "+rev);
	}

}
