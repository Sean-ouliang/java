package day03;
import java.util.Scanner;
//作业
public class Test03 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份（例如：2012）");
		int year = scanner.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
	}
}
