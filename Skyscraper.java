package com.greatlearning.dsa.ass3.service;

import java.util.Collections;
import java.util.LinkedList;

public class Skyscraper {
	
	public void skyScraper(LinkedList<Integer> lk, int floors) {
		
		int j =0;
		int ref=0;
		
		if(lk.isEmpty()) {
			return;
		}
			
		for(int i =1;i<=floors;i++) {	
			int a = lk.get(j);
			int max = Collections.max(lk); 
			System.out.println("\nDay: "+i);
			if(a!=max) {
				System.out.println(" ");
				j++;
			}
			if(a==max) {
				if(max==lk.getLast()) {
					final int index = lk.indexOf(max);
					ref = lk.get(index);
				}
				else {
					final int index = lk.indexOf(max);
					ref = lk.get(index+1);
				}
				int b= lk.indexOf(max);
				int s = lk.remove(j);
				System.out.print(s+" ");
				
				if(!lk.isEmpty()) {
					for(int k=0;k<b;) {
						if(!lk.isEmpty()) {
							max = Collections.max(lk);
							if(lk.get(k)==max) {
								s = lk.remove(k);
								System.out.print(s+" ");
								k=0;
								b--;
							}
							else k++;
						}
					}
				}
				j= lk.indexOf(ref);
			}
		}
	}

}