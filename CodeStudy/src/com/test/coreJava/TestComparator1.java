package com.test.coreJava;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.test.samplebeans.*;

/* This Program is to test  Comparator interface implementation 
 * Use Developer pojo objects  and Comparator interface implementation to sort custome Developer objects and then Print 
 * 
 * Use Lamda expression to do the sort as well as Collections.sort
 * */

public class TestComparator1 {
	
	public static void main(String[] args) {
		
		List<Developer> memberList = addDevelopers();
		
		// Print the List 
		System.out.println("List #");
		for (Developer developer:memberList) {
			System.out.println(developer);
		}
		
		System.out.println(" ************  AFTER SORTING ****************");
		// Sort the List
		Collections.sort(memberList, new Comparator<Developer>() {
			@Override
			public int compare(Developer d1, Developer d2) {
				
				return d1.getAge() - d2.getAge();
			}
			
		});
		
		// Sort using Lambda Expression 
		//memberList.sort((Developer d1, Developer d2)->d1.getAge() -d2.getAge());
		memberList.forEach((Developer)->System.out.println(Developer));
		
		
	}
	
	public static List<Developer> addDevelopers(){
		
		List<Developer> devList = new ArrayList<Developer>();
		
		devList.add(new Developer("Ram",34,new BigDecimal("70000")));
		devList.add(new Developer("Sham",36,new BigDecimal("110000")));
		devList.add(new Developer("Ravi",32,new BigDecimal("75000")));
		devList.add(new Developer("John",23,new BigDecimal("82000")));
		
		return devList;
		
	}
	
	
	

}
