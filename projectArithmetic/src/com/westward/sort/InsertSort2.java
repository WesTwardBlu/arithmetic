package com.westward.sort;

import java.util.Arrays;

public class InsertSort2 {
	public static void main(String[] args) {
		int[] arrays= {12,43,7,90,14,78};
		System.out.println("初始数组          ："+ Arrays.toString(arrays));
		sort2(arrays);
	}
	
	public static void sort(int[] a) {
		int i,j,t;
		for (i = 1; i < a.length; i++) {
			t= a[i];
			j= i-1;
			while(j>=0 && t< a[j]){
				a[j+1]= a[j];
				j--;
			}
			a[j+1]= t;
			System.out.println("第"+ i+ "步排序结果："+ Arrays.toString(a));
		}
	}
	
	public static void sort2(int[] arr) {
		int temp,j;
		for (int i = 1; i < arr.length; i++) {//i:每次大的排序的部数
			temp= arr[i];
			j= i-1;
			while (j>=0 && temp<arr[j] ) {//移位
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]= temp;
			System.out.println("第"+ i+ "步排序结果："+ Arrays.toString(arr));
		}
	}
}
