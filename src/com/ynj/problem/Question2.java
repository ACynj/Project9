package com.ynj.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2 {
	
	public static void removeDuplicate(ArrayList<Integer>list ) {
		List <Integer> list2=new ArrayList<>();
		boolean isExis=false;
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list2.size();j++) {
				if(list.get(i)==list2.get(j)) {
					isExis=true;
					break;
				}
			}
			if(isExis) {
				isExis=false;
			}
			else {
				list2.add(list.get(i));
			}
		}
		for(int i=0;i<list2.size();i++){
			System.out.print(list2.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	List<Integer>list=new ArrayList<>();
	System.out.println("请输入十个整数:");
	Scanner in=new Scanner(System.in);
	for(int i=0;i<10;i++) {
		Integer x=in.nextInt();
		list.add(x);
	}
	removeDuplicate((ArrayList<Integer>) list);
	}

}
