package day02;
import java.util.Scanner;
//Scanner��ʾ
public class ScannerDemo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("����������:");
		int age = scan.nextInt();
		System.out.println("������۸�:");
		double price = scan.nextDouble();
		
		System.out.println(age);
		System.out.println(price);
	}
}
