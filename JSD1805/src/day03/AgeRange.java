package day03;
import java.util.Scanner;
//�����жϳ���
public class AgeRange {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("����������:");
		int age = scan.nextInt();
		if(age>=18 && age<=50){
			System.out.println("��");
		}else{
			System.out.println("��");
		}
		System.out.println(age);
		System.out.println(age>=18 && age<=50);
	}
}
