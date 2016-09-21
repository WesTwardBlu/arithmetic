package com.westward.sort;

import java.util.Arrays;

/**
 * 插入排序就是每一步都将一个待排数据按其大小插入到已经排序的数据中的适当位置，直到全部插入完毕。
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
	
	//从小到大，插入排序
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
	
	public static void change(int[] arrs,int index1,int index2){//换位
		int temp= arrs[index1];
		arrs[index1]= arrs[index2];
		arrs[index2]= temp;
	}
	
	public static void insert(int[] arrs,int index){//index之前的数，都进一步。然后arr[index]赋值给arr[0]
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
