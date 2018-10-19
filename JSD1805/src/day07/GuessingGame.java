package day07;

import java.util.Scanner;

//���ַ�С��Ϸ
public class GuessingGame {
	/**������*/
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char[] chs = generate();//��ȡ����ַ�����
		System.out.println(chs);
		int score = 0;//�÷�
		int count = 0;//�´����
		while(true){//������ѭ��
			System.out.println("�°�!");
			String str = scan.next().toUpperCase();//�������룬�����������ĸ�ĳɴ�д��ĸ
			if(str.equals("EXIT")){//�Ա����룬������exit����ѭ��
				System.out.println("�´�������!");
				break;//����ѭ��
			}
			char[] input = str.toCharArray();//���ַ���ת��Ϊ�ַ�����
			int[] result = check(chs,input);//����
			if(result[0]==chs.length){//λ������������ַ����鳤��ʱ����ʾ�¶���
				score = chs.length*100-count*10;
				System.out.println("��ϲ�㣬�¶��ˣ��÷�Ϊ��"+score);
				break;//�¶��ˣ�������Ϸ
			}else{
				count++;
				System.out.println("�´��ˣ��¶��ַ���Ϊ��"+result[1]+"�¶�λ����Ϊ��"+result[0]);
			}
		}
	}
	
	/**��������ַ�����*/
	public static char[] generate(){
		char[] chs = new char[5];//����ַ�����
		char[] letters = {'A','B','C','D','E','F','G','G','H','I','J',
				'K','L','M','N','O','P','Q','R','S','T','U','V','W',
				'X','Y','Z'};//�ַ���Χ����
		boolean[] flags = new boolean[letters.length];
		for(int i=0;i<chs.length;i++){//��������ַ�����
			int index;
			do{
				index = (int)(Math.random()*letters.length);//��ȡ�±�
			}while(flags[index]);
			chs[i] = letters[index];//�����±�index��letters������ȡֵ
			flags[index] = true;
		}
		/*
		 * i=0  index=0       chs[0]='A'  flags[0]=true
		 * i=1  index=25      chs[25]='Z' flags[25]=true
		 * i=2 ....
		 * i=3 ....
		 */
		/*
		 * i=0 index=0  chs[0]='A'
		 * i=1 index=3  chs[3]='D'
		 */
		return chs;
	}
	
	/**�Աȣ�����ַ�����chs���û�������ַ�����input*/
	public static int[] check(char[] chs,char[] input){
		int[] result = new int[2];//����result[0]Ϊλ�öԣ�result[1]Ϊ�ַ���
		for(int i=0;i<chs.length;i++){//��������ַ�����
			for(int j=0;j<input.length;j++){//�����û������ַ�����
				if(chs[i]==input[j]){//�ַ���
					result[1]++;//�ַ��Ը�����1
					if(i==j){//λ�ö�
						result[0]++;//λ�öԸ�����1
					}
					break;//ʣ��inputԪ�ز��ٲ���Ƚ���
				}
			}
		}
		return result;
	}
}
