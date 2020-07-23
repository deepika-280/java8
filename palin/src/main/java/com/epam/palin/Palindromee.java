package com.epam.palin;

import java.util.*;
import java.util.stream.Stream;
@FunctionalInterface
interface fun{
	void palindrome(List<String> a);
}
public class Palindromee 
{
	public static void palin(List<String> l) {
		Stream<String> o=l.stream();
		o.filter(i->i.equals(new StringBuilder(i).reverse().toString())).forEach(i->System.out.println(i));
		
	}
	public static void check(fun fun,List<String> ll) {
		fun.palindrome(ll);	
	}
    public static void main( String[] args )
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter number of strings");
    	int n=s.nextInt();
    	List<String> list=new ArrayList<String>();
    	s.nextLine();
    	for(int i=0;i<n;i++) {
    		System.out.println("Enter the value of string "+(i+1));
    		list.add(s.nextLine());
    	}
    	System.out.println("palindromes present in the list are");
    	check(Palindromee::palin,list);
    }
}