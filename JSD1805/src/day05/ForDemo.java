package day05;
//forѭ������ʾ
public class ForDemo {
	public static void main(String[] args){
		//�ۼӺ�:1+2+3+4+...+100=?
		int sum = 0;
		for(int i=1;i<=100;i++){
			sum += i;
		}
		System.out.println("sum="+sum);
		
		/*
		 *       sum=0
		 * i=1   sum=1
		 * i=2   sum=1+2
		 * i=3   sum=1+2+3
		 * ...
		 * i=100 sum=1+2+3+...+100
		 * i=101  ����ѭ��
		 */
		sum = 0;
		int count = 1;
		while(count<=100){
			sum += count;
			count++;
		}
		System.out.println("sum="+sum);
		
		sum = 0;
		count = 1;
		do{
			sum += count;
			count++;
		}while(count<=100);
		System.out.println("sum="+sum  );
	}
}
