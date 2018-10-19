package day03;
import java.util.Scanner;
//分支结构的演示
public class ConditionDemo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数字:");
		int num = scan.nextInt();
		if(num%2 == 0){
			System.out.println(num+"是偶数");
		}else{
			System.out.println(num+"是奇数");
		}
		System.out.println("over");
	}
}
