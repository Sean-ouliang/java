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
				System.out.println("1����������  2�����¿�ʼ  3���˳���Ϸ");
				input = (int)(Math.random());
				break;
			case 2:
				input = 3;
				break;
			default:
				System.out.println("1����������  2�����¿�ʼ  3���˳���Ϸ");
			}
			if(input==3){
				System.out.println("�´������ɣ�");
				break;
			}
			input = scan.nextInt();
			if(input==3){
				System.out.println("�´������ɣ�");
				break;
			}
			switch(input){
			case 1:
				count = (int)(Math.random()*10);
				num += count;
				if(num<21){
					
				}else if(num==21){
					System.out.println("��Ϸ��ɣ�1������һ��  2���˳���Ϸ");
					output = scan.nextInt();
				}else{
					System.out.println("��Ϸʧ�ܣ�����Ϊ"+num+"��1����ͷ��ʼ  2���˳���Ϸ");
					output = scan.nextInt();
				}
				break;
			case 2:
				num = (int)(Math.random()*10);
			}
		}
	}
}
