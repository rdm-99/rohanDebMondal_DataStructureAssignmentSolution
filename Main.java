package com.greatlearning.dsa.ass3.main;

import java.util.LinkedList;
import java.util.Scanner;

import com.greatlearning.dsa.ass3.service.Skyscraper;

public class Main {

	public static void main(String[] args) {
		Skyscraper sn = new Skyscraper();
		LinkedList<Integer> lk = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int floors = sc.nextInt();
		for(int i=1;i<=floors;i++) {
			System.out.println("enter the floor size given on day : "+i);
			int sizeOfFloor = sc.nextInt();
			lk.add(sizeOfFloor);
		}
		System.out.println("The order of construction is as follows ");
		
		sn.skyScraper(lk,floors);		
		sc.close();
	}
	
}