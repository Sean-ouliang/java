package day03;
import java.util.Scanner;
//ÄêÁäÅĞ¶Ï³ÌĞò
public class AgeRange {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄêÁä:");
		int age = scan.nextInt();
		if(age>=18 && age<=50){
			System.out.println("ÊÇ");
		}else{
			System.out.println("·ñ");
		}
		System.out.println(age);
		System.out.println(age>=18 && age<=50);
	}
}
