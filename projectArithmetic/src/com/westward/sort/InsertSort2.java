package com.westward.sort;

import java.util.Arrays;

public class InsertSort2 {
	public static void main(String[] args) {
		int[] arrays= {12,43,7,90,14,78};
		System.out.println("��ʼ����          ��"+ Arrays.toString(arrays));
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
			System.out.println("��"+ i+ "����������"+ Arrays.toString(a));
		}
	}
	
	public static void sort2(int[] arr) {
		int temp,j;
		for (int i = 1; i < arr.length; i++) {//i:ÿ�δ������Ĳ���
			temp= arr[i];
			j= i-1;
			while (j>=0 && temp<arr[j] ) {//��λ
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]= temp;
			System.out.println("��"+ i+ "����������"+ Arrays.toString(arr));
		}
	}
}
