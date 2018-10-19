package day05;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输出正方形边长:");
		int bc = scan.nextInt();
		zfx(bc);
	}
	
	public static void zfx(int bc){
		for(int i=1;i<=bc;i++){
			for(int j=1;j<=bc;j++){
				if(i>1 && i<bc && j>1 && j<bc){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
