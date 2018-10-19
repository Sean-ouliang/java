package day05;

import java.util.Scanner;

//作业
public class Homework01 {
	public static void main(String[] arge){
		/*
		int[] arr1 = new int[4];
		int[] arr2 = new int[]{2,4,3,6};
		int[] arr3 = {4,7,9,3};
		*/
		
		
		
		/*
		 * int[]是一种引用数据类型
		 */
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入整数（例如10）");
		int n = scan.nextInt();
		double sum = 0;
		if(n>=2){
			for(int i=1;i<=n;i++){
				sum += 1.0/i;
			}
		}
		System.out.println("sum="+sum);
		
		
		
		
		/*
		long num = 0;
		long sum = 0;
		for(int i=0;i<10;i++){
			num = num*10+9;
			sum += num;
		}
		System.out.println("sum="+sum);
		*/
		
		
		/*
		for(int i=0;i<4;i++){
			if(i==2){
				continue;
			}
			System.out.print("i="+i+" ");//0 1 3
		}
		*/
		
		
		
		/*
		for(int i=0;i<10;i++){
			System.out.println("i="+i);//0,1,2
			if(i==2){
				break;
			}
		}
		*/
		
		
		
		/*
		for(int i=0,j=0,k=0;i<10&&j<4&&k<10;j+=2){
			System.out.println(i++);//0,1
			System.out.println(++k+i);//2,4
		}
		*/
	}
}
