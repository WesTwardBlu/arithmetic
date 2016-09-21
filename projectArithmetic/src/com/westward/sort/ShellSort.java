package com.westward.sort;

import java.util.Arrays;

/**
 * shell排序，也叫希尔排序。
 * <br>shell排序，严格来说基于插入排序。
 * <br>1.将有n个元素的数组分成n/2个序列(小数点后的舍掉)，第1个和第1+n/2个数据为一对...
 * <br>2.一次循环使每个序列对排好序
 * <br>3.然后在变为n/4个序列,在次排序
 * <br>4.不断重复上述过程，随着序列减少为最后一个，也就完成了整个排序
 * */
public class ShellSort {
	public static void main(String[] args) {
		int[] arr= {127,118,105,101,112,100};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		arr= null;
	}
	
	public static void sort(int[] arr){	//4,3,9,0,1,5
		//排序 序列
		int gal= 2;//存储 2,4,6...
		int times;//存储1+n/2
		int temp;//临时变量
		while((times=arr.length/gal)>1){
			for (int i = 0; i <times; i++) {
				if (arr[i]>arr[i+times]) {
					temp= arr[i];
					arr[i]= arr[i+times];
					arr[i+times]= temp;
				}
			}
			gal*=2;
		}
		//插入排序
		int temp2,j;
		for (int i = 1; i < arr.length; i++) {
			temp2= arr[i];
			j= i-1;
			while (j>=0 && temp2< arr[j]) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]= temp2;
		}
	}
}
