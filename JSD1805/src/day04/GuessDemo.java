package day04;
import java.util.Scanner;
public class GuessDemo {
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
			System.out.println("��ϲ�㣬�¶���");
		}else{
			System.out.println("�´������ɣ�");
		}
		
		
		
		
		
		/*
		System.out.println("�°�!");
		int guess = scanner.nextInt();
		while(guess!=num){
			if(guess == 0){
				break;
			}
			if(guess>num){
				System.out.println("�´���");
			}else{
				System.out.println("��С��");
			}
			System.out.println("�°�!");
			guess = scanner.nextInt();
		}
		if(guess==num){
			System.out.println("��ϲ�㣬�¶��ˣ�");
		}else{
			System.out.println("�´������ɣ�");
		}
		*/
		
		
		
		/* 
		while(true){
			if(guess==0){
				System.out.println("�´������ɣ�");
				break;
			}
			if(guess>num){
				System.out.println("�´���");
			}else if(guess<num){
				System.out.println("��С��");
			}else{
				System.out.println("��ϲ�㣬�¶��ˣ�");
				break;
			}
			System.out.println("�°�!");
			guess = scanner.nextInt();
		}
		*/
	}
}
