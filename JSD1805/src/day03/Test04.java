package day03;
import java.util.Scanner;
//作业
public class Test04 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请依次输入三个整数:a,b,c(以空格隔开)");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("最大值为"+max);
	}
}
