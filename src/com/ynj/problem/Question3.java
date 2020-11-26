package com.ynj.problem;
import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<Double> xList=new ArrayList<>();
		ArrayList<Double> yList=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of points:");
		int size=in.nextInt();
		System.out.println("输入点坐标");
		for(int i=0;i<size;i++) {
			Double x=in.nextDouble();
			Double y=in.nextDouble();
			xList.add(x);
			yList.add(y);
		}
		xList.add(xList.get(0));
		yList.add(yList.get(0));
		Double jia=0.0;
		Double jian=0.0;
		for(int i=0;i<xList.size()-1;i++) {
			jian+=xList.get(i)*yList.get(i+1);
		}
		for(int i=0;i<yList.size()-1;i++) {
			jia+=yList.get(i)*xList.get(i+1);
		}
		Double sum=jian-jia;
		sum=Math.abs(sum);
		System.out.println(sum*1/2);
		
	}

}
