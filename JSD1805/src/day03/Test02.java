package day03;
import java.util.Scanner;
//��ҵ
public class Test02 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������������:a,b,c(�Կո����)");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println("���������:");
		System.out.println("a="+a+",b="+b+",c="+c);
		System.out.println("�������к󣬽��Ϊ:");
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
