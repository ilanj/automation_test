package collections_aug2017;

import java.util.*;

public class Al {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		ArrayList <String> a=new ArrayList <String>();
		a.add("ravi");
		a.add("ravi");//as no error occured al allows element duplication
		a.add("ila");
		System.out.println(a);// prnts as [ravi, ravi, ila]
		 
		//adding elements using for loop and run time initialization------------------------------------
		int n,i;
		System.out.println("enter n value");
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			a.add(in.next());
		}
		System.out.println(a);
		//-------------------printing same elemets using iterator--------------------------------
		Iterator itr=a.iterator();//first Iterator and second iterator should compulsorily have small i, iterator
		while(itr.hasNext())
			System.out.println(itr.next());
		//
	}

}
