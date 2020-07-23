package com.epam.java_8_2;

import java.util.*;
import java.util.stream.Stream;
@FunctionalInterface
interface fun{
	List<String> check(List<String> a);
}
public class javatwo 
{
	
    public static void main( String[] args )
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter number of strings");
    	int n=s.nextInt();
    	List<String> a=new ArrayList<String>();
    	s.nextLine();
    	for(int i=0;i<n;i++) {
    		System.out.println("Enter the value of string "+(i+1));
    		a.add(s.nextLine());
    	}
    	fun res=(li)->{ 
    		List<String> l=new ArrayList<String>();
    		for(String i:li) {
    			if(i.charAt(0)=='a' && i.length()==3) {
    				l.add(i);
    			}
    		}
    		return l;
    	};
    	System.out.println("strings that start with letter a and has length 3 using lambdas are "+res.check(a));
    	Stream<String> st=a.stream();
    	System.out.println("strings that start with letter a and has length 3 using streams are");
    	st.filter(j->j.startsWith("a")).filter(j->j.length()==3).forEach(j->System.out.println(j));
    }
}