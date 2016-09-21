package com.westward.sort;

import java.util.Arrays;

/**
 * shell����Ҳ��ϣ������
 * <br>shell�����ϸ���˵���ڲ�������
 * <br>1.����n��Ԫ�ص�����ֳ�n/2������(С���������)����1���͵�1+n/2������Ϊһ��...
 * <br>2.һ��ѭ��ʹÿ�����ж��ź���
 * <br>3.Ȼ���ڱ�Ϊn/4������,�ڴ�����
 * <br>4.�����ظ��������̣��������м���Ϊ���һ����Ҳ���������������
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
		//���� ����
		int gal= 2;//�洢 2,4,6...
		int times;//�洢1+n/2
		int temp;//��ʱ����
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
		//��������
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
