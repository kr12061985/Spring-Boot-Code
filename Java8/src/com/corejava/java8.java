package com.corejava;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8 {
	public static void main(String[] args) {
		Employee e=new Employee("kishore",2000000);
		Employee e1=new Employee("kishore",2000000);
		
		Map<Employee,Integer> m=new HashMap<Employee,Integer>();
		m.put(e,1);
		m.put(e1, 2);
		System.out.println(m.size());
		
		Set<Employee> s=new HashSet<Employee>();
		    s.add(e1);
		    s.add(e);
		    System.out.println(s.size());
		    
		    List<Integer> a=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		   
		     a.forEach(System.out::println);
		     
		     String words="this is kishore"
		     		+ " h r u"
		     		+ " iam in hyderabad";
		     String s2=Stream.of(words.trim().split("\\s"))
				     .filter(word -> word.length() > 0)
				     .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
				     .collect(Collectors.joining(" "));
		    System.out.print( s2);
		    
		    String str = "Hello world";
		    String revString = "";

		    for (int i = str.length() - 1; i >= 0; i--) {
		     revString += str.charAt(i);
		    }

		    System.out.println(revString);
		    
		    List<Integer>list=new ArrayList<>(Arrays.asList(5,2,8,1,4));
		    List<Integer> l1=list.stream().sorted((e4,e3)->-e4.compareTo(e3)).collect(Collectors.toList());
		    l1.forEach(System.out::println);
	}

}
