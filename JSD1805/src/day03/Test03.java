package day03;
import java.util.Scanner;
//��ҵ
public class Test03 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ݣ����磺2012��");
		int year = scanner.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}
	}
}