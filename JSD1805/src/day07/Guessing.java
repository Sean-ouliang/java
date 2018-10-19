package day07;

import java.util.Scanner;

//���ַ�С��Ϸ
public class Guessing {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char[] chs = generate();
		System.out.println(chs);
		int score = 0;
		int count = 0;
		while(true){
			System.out.println("�°ɣ�");
			String str = scan.next().toUpperCase();
			if(str.equals("EXIT")){
				System.out.println("�Ͽ���ؼҰɣ�");
				break;
			}
			char[] input = str.toCharArray();
			int[] result = check(chs,input);
			if(result[0] == chs.length){
				score = chs.length*100-count*10;
				System.out.println("ţ�ƣ����Ȼ�¶��ˣ��÷�Ϊ��"+score);
				break;
			}else{
				count++;
				System.out.println("ɵ�ƣ���´��ˣ��ַ���"+result[1]+"����λ�ö�"+result[0]+"��");
			}
		}
	}
	
	/**��������ַ�����*/
	public static char[] generate(){
		char[] chs = new char[5];
		char[] letters = {'A','B','C','D','E','F','G','G','H','I','J',
				'K','L','M','N','O','P','Q','R','S','T','U','V','W',
				'X','Y','Z'};
		boolean[] flags = new boolean[letters.length];
		int index;
		for(int i=0;i<chs.length;i++){
			do{
				index = (int)(Math.random()*letters.length);
			}while(flags[index]);
			chs[i] = letters[index];
			flags[index] = true;
		}
		return chs;
	}
	
	/**�Աȣ��û������ַ���������������ַ�����Ա�*/
	public static int[] check(char chs[],char input[]){
		int[] result = new int[2];
		for(int i=0;i<chs.length;i++){
			for(int j=0;j<input.length;j++){
				if(chs[i]==input[j]){
					result[1]++;
					if(i==j){
						result[0]++;
					}
					break;
				}
			}
		}
		return result;
	}
}
