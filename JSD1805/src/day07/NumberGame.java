package day07;
import java.util.Scanner;
public class NumberGame {
	public static void main(String[] arge){
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*10);
		int input = 0;
		int output = 0;
		int count = 0;
		while(true){
			switch(output){
			case 1:
				num = (int)(Math.random());
				System.out.println("1、继续发牌  2、重新开始  3、退出游戏");
				input = (int)(Math.random());
				break;
			case 2:
				input = 3;
				break;
			default:
				System.out.println("1、继续发牌  2、重新开始  3、退出游戏");
			}
			if(input==3){
				System.out.println("下次再来吧！");
				break;
			}
			input = scan.nextInt();
			if(input==3){
				System.out.println("下次再来吧！");
				break;
			}
			switch(input){
			case 1:
				count = (int)(Math.random()*10);
				num += count;
				if(num<21){
					
				}else if(num==21){
					System.out.println("游戏完成！1、再来一把  2、退出游戏");
					output = scan.nextInt();
				}else{
					System.out.println("游戏失败！点数为"+num+"，1、重头开始  2、退出游戏");
					output = scan.nextInt();
				}
				break;
			case 2:
				num = (int)(Math.random()*10);
			}
		}
	}
}
