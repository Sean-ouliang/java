package day03;
import java.util.Scanner;
//��ҵ
public class Test04 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������������:a,b,c(�Կո����)");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("���ֵΪ"+max);
	}
}
