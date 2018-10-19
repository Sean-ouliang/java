package day03;
import java.util.Scanner;
public class Cashier {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入单价:");
		double price = scan.nextDouble();
		System.out.println("请输入数量:");
		double number = scan.nextDouble();
		System.out.println("请输入金额:");
		double money = scan.nextDouble();
		
		double totalPrice = price*number;
		if(totalPrice>=500){
			totalPrice *= 0.8;
		}
		if(money<totalPrice){
			System.out.println("ERROR！你给的钱不够！还差"+(totalPrice-money));
		}else{
			double change = money - totalPrice;
			System.out.println("总价为："+totalPrice+"，找零为："+change);
		}

		/*
		int length = 10;
		System.out.println(length);
		
		int age = 21;
		System.out.println(age);
		
		int count = 30;
		count = 60;
		System.out.println(count);//60
		
		int $size = 20;
		System.out.println($size);
		
		int i = 128;
		//i = 10000000008;//类型不匹配
		System.out.println(i);
		
		double width = 6.0;
		double length = 4.9;
		System.out.println(width - length);//溢出
		
		char ascii = 98;
		System.out.println(ascii);//b
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1+b2);
		*/
	}
}






