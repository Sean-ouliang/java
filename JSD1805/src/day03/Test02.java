package day03;
import java.util.Scanner;
//作业
public class Test02 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请依次输入三个整数:a,b,c(以空格隔开)");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println("您输入的是:");
		System.out.println("a="+a+",b="+b+",c="+c);
		System.out.println("升序排列后，结果为:");
		int m = 0;
		if(a>b){
			m = a;
			a = b;
			b = m;
		}
		if(a>c){
			m = a;
			a = c;
			c = m;
		}
		if(b>c){
			m = b;
			b = c;
			c = m;
		}
		System.out.println("a="+a+",b="+b+",c="+c);
	}
}
