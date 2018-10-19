package day06;

import java.util.Arrays;

//作业
public class Hellowork01 {
	public static void main(String[] args){
		int[] arr = new int[10];
		System.out.print("数组中的数据为：[");
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(",");
			}
		}
		System.out.println("]");
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println("最小值是："+min);
		arr = Arrays.copyOf(arr,arr.length+1);
		for(int i=arr.length-1;i>=0;i--){
			if(i == 0){
				arr[i] = min;
			}else{
				arr[i]=arr[i-1];
			}
		}
		System.out.print("新数组中的数据为：[");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}












