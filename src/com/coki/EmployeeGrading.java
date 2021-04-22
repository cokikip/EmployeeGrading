package com.coki;

import java.util.Scanner;

public class EmployeeGrading {
	
	public static void main(String[] args) {
		String names="",asCount="",grades="";
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the employee names: ");
		names = sc.next();
		System.out.println("Enter the employee names: ");
		asCount = sc.next();
		System.out.println("Enter the employee names: ");
		grades = sc.next();
		
		String[] n = names.split(",");
		String[] a = asCount.split(",");
		String[] g = grades.split(",");
		
		for(int i=0;i<n.length;i++) {
			System.out.println("Hello "+n[i]+" you current grade is "+g[i]+"  and you can get"+(a[i]));
		}
		
		sc.close();
		
	}

}
