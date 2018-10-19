package day04;

import java.util.Scanner;

//重写do...while
public class GuessDemo1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		int guess;
		do{
			System.out.println("猜吧！");
			guess = scanner.nextInt();
			if(guess==0){
				break;
			}
			if(guess>num){
				System.out.println("猜大了");
			}else if(guess<num){
				System.out.println("猜小了");
			}
		}while(guess!=num);
		if(guess==num){
			System.out.println("恭喜你，猜对了！");
		}else{
			System.out.println("下次再来吧！");
		}
	}
}
