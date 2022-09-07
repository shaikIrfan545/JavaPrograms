package listinterface;

import java.util.LinkedList;

public class LinkedListDemo 
{
public static void main(String[] args) 
	{
	LinkedList<String> s=new LinkedList<>();
	s.add("irfan");
	s.add("tanzeem");
	LinkedList<String> s1=new LinkedList<>();
	s1.add("Kalesha");
	s1.add("ramesh");
	s1.add("suresh");
	s1.addAll(1, s);
	for(String s2:s1)
	{
		System.out.println(s2);
	}
	s1.remove(2);
	for(String s2:s1)
	{
		System.out.println(s2);
	}
	s1.poll();
	for(String s2:s1)
	{
		System.out.println(s2);
	}
	}
}
