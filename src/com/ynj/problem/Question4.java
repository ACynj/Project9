package com.ynj.problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {

	public static ArrayList<Character> toCharacter(String s){
		ArrayList<Character> list=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			list.add((Character)s.charAt(i));
		}
		return list;
	}
	
	public static void main(String[] args) {
		ArrayList<Character> list=new ArrayList<>();
		System.out.println("请输入一个字符串:");
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		list=toCharacter(str);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
