package day05;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int score = 0;
		for(int i=1;i<=10;i++){
			int a = (int)(Math.random()*100+1);
			int b = (int)(Math.random()*100+1);
			int result = a+b;
			System.out.println("("+i+")"+a+"+"+b+"=?");
			System.out.println("���!");
			int input = scan.nextInt();
			if(input == -1){
				System.out.println("�´�������!");
				break;
			}
			if(result == input){
				score += 10;
				System.out.println("�����");
			}else{
				System.out.println("�����");
			}
		}
		System.out.println("�ܵ÷�Ϊ:"+score);
	}
}
