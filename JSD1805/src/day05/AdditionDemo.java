package day05;

import java.util.Scanner;

/**����ӷ�����*/
public class AdditionDemo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int score = 0;
		for(int i=1;i<=10;i++){
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			int result = a+b;
			System.out.println("("+i+")"+a+"+"+b+"=?");
			System.out.println("��ɣ�");
			int input = scan.nextInt();
			if(input==-1){
				System.out.println("�´�������");
				break;
			}
			if(input==result){
				score += 10;
				System.out.println("�����");
			}else{
				System.out.println("�����");
			}
		}
		System.out.println("�ܹ��÷�Ϊ��"+score);
	}
}
