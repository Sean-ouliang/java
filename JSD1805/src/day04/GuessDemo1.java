package day04;

import java.util.Scanner;

//��дdo...while
public class GuessDemo1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		int guess;
		do{
			System.out.println("�°ɣ�");
			guess = scanner.nextInt();
			if(guess==0){
				break;
			}
			if(guess>num){
				System.out.println("�´���");
			}else if(guess<num){
				System.out.println("��С��");
			}
		}while(guess!=num);
		if(guess==num){
			System.out.println("��ϲ�㣬�¶��ˣ�");
		}else{
			System.out.println("�´������ɣ�");
		}
	}
}
