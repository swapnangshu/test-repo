package com.test.coreJava;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.test.samplebeans.Developer;

/* This Program is to test  Comparator interface implementation 
 * Use Developer pojo objects  and Comparator interface implementation to sort custome Developer objects and then Print 
 * 
 * Use Lamda expression to do the sort as well as Collections.sort
 * */

public class TestComparator_lambda {

	public static void main(String[] args) {
		
		List<Developer> developersList=new ArrayList<Developer>();
		developersList=addDevelopers();
		
		// Print the list.
		System.out.println(" Print the Initial list");
		developersList.forEach((Developer d)->System.out.println(d.toString()));
		System.out.println("");
		
		//Sort the list by age
		developersList.sort((Developer d1,Developer d2)-> d1.getAge() - d2.getAge());
		
		// Print the list after sort.
		System.out.println(" Print the list after sort");
		developersList.forEach((Developer d)->System.out.println(d.toString()));
		
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
