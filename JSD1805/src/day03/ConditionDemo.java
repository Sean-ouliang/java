package day03;
import java.util.Scanner;
//��֧�ṹ����ʾ
public class ConditionDemo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("����������:");
		int num = scan.nextInt();
		if(num%2 == 0){
			System.out.println(num+"��ż��");
		}else{
			System.out.println(num+"������");
		}
		System.out.println("over");
	}
}
