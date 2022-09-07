package listinterface;

import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
	ArrayList<Integer> a=new ArrayList<>();
	//adding object to arraylist
	a.add(20);
	a.add(30);
	for(Integer i:a)
	{
		System.out.println(i);
	}
	System.out.println("===========");
	//removening object from arraylist
	a.remove(0);
	for(Integer i:a)
	{
		System.out.println(i);
	}
	System.out.println("============");
	//add element in to speacific index
	a.add(0, 70);
	for(Integer i:a)
	{
		System.out.println(i);
	}
	System.out.println(a.isEmpty());
	ArrayList<Integer> b=new ArrayList<>();
	b.add(20);
	b.add(80);
	b.add(100);
	b.add(40);
	a.addAll(b);
	for(Integer  c:a)
	{
		System.out.println(c);
	}
	System.out.println("==========");
	System.out.println(a.size());
 	}
}
