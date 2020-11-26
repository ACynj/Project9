package com.ynj.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int [][]a = new int [1000][1000]; 
		int [] maxRow=new int[1000];
		int [] maxColumn=new int[1000];
		List RowList=new ArrayList<>();
		List ColumnList=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		System.out.println("The size of the array:");
		int size=in.nextInt();
		System.out.println("The Random array is:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				int x=(int)(Math.random()*2);
				a[i][j]=x;
			}
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	
	
	//将每行的1的总数放入RowList
	int rowcount=0;
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			if(a[i][j]==1) {
				rowcount++;
			}
		}RowList.add(i,rowcount);
			rowcount=0;
	}
	
	//将每列1的总数放入ColumnList
	int columncount=0;
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			if(a[j][i]==1) {
				columncount++;
			}
			
		}ColumnList.add(columncount);
			columncount=0;
	}
	int maxR=0;
	for(int i=0;i<RowList.size();i++) {
		if((int)(RowList.get(i))>maxR) {
			maxR=(int)(RowList.get(i));
		}
	}
	
	System.out.println("The max row of the array:");
	for(int i=0;i<RowList.size();i++) {
		if((int)(RowList.get(i))==maxR) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
	int maxC=0;
	for(int i=0;i<ColumnList.size();i++) {
		if((int)(ColumnList.get(i))>maxC) {
			maxC=(int)(ColumnList.get(i));
		}
	}
	System.out.println("The max column of the array:");
	for(int i=0;i<ColumnList.size();i++) {
		if((int)(ColumnList.get(i))==maxC) {
			System.out.print(i+" ");
		}
	}
	
	
	}
}
