package day04;

import java.util.Scanner;

//作业
public class HomeWork01 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的工资的税前金额（¥）：");
		double money = scanner.nextDouble();
		money -= 3500;
		double tax;
		if(money<=0){//工资低于3500不交税
			tax = 0.0;
		}else if(money<=1500){
			tax = money*0.03;
		}else if(money<=4500){
			tax = money*0.1-105;
		}else if(money<=9000){
			tax = money*0.2-555;
		}else if(money<=35000){
			tax = money*0.25-1005;
		}else if(money<=55000){
			tax = money*0.3-2755;
		}else if(money<=80000){
			tax = money*0.35-5505;
		}else{
			tax = money*0.45-13505;
		}
		System.out.println("你应该缴纳的个人所得税是：¥"+tax);
	}
}
