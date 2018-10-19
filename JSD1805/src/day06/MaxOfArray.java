package day06;

import java.util.Arrays;

//找数组中最大值
public class MaxOfArray {
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("最大值为:"+max);
		arr = Arrays.copyOf(arr,arr.length+1);
		arr[arr.length-1] = max;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("复制:");
		
		int[] a = {10,20,30,40,50};
		int[] a1 = new int[5];
		System.arraycopy(a,1,a1,0,4);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);//20,30,40,50,0
		}
	}
}
