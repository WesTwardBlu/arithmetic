package com.westward.sort;

import java.util.Arrays;

/**
 * �����������ÿһ������һ���������ݰ����С���뵽�Ѿ�����������е��ʵ�λ�ã�ֱ��ȫ��������ϡ�
 * */
public class InsertSort {
	public static void main(String[] args) {
//		int[] arrs= {3,5,2,1,6,9,8,0};
		int[] arrs= {3,5,2,21,61,9,18,0};
		System.out.print(Arrays.toString(arrs));
		System.out.println();
		insertSortTest(arrs);
		System.out.print(Arrays.toString(arrs));
	}
	
	//��С���󣬲�������
	//4312
	public static void insertSortTest(int[] arrs) {
		a: for (int i = 1; i < arrs.length; i++) {
			b:for (int j = 1; j < i; j++) {
				if (arrs[0]> arrs[i]) {
					insert(arrs, i);
					continue a;
				}else {
					if (arrs[j]> arrs[i]) {
						change(arrs, j, i);
					}else {
						continue b;
					}
				}
			}
		}
	}
	
	public static void change(int[] arrs,int index1,int index2){//��λ
		int temp= arrs[index1];
		arrs[index1]= arrs[index2];
		arrs[index2]= temp;
	}
	
	public static void insert(int[] arrs,int index){//index֮ǰ����������һ����Ȼ��arr[index]��ֵ��arr[0]
		int temp = arrs[index];
		while (true) {
			arrs[index]= arrs[--index];
			if (index== 0) {
				break;
			}
		}
		arrs[0]= temp;
	}
}
