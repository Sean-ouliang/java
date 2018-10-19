package day07;

import java.util.Scanner;

//猜字符小游戏
public class Guessing {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char[] chs = generate();
		System.out.println(chs);
		int score = 0;
		int count = 0;
		while(true){
			System.out.println("猜吧！");
			String str = scan.next().toUpperCase();
			if(str.equals("EXIT")){
				System.out.println("赶快滚回家吧！");
				break;
			}
			char[] input = str.toCharArray();
			int[] result = check(chs,input);
			if(result[0] == chs.length){
				score = chs.length*100-count*10;
				System.out.println("牛逼，你居然猜对了！得分为："+score);
				break;
			}else{
				count++;
				System.out.println("傻逼，你猜错了，字符对"+result[1]+"个，位置对"+result[0]+"个");
			}
		}
	}
	
	/**生成随机字符数组*/
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
	
	/**对比：用户输入字符数组与随机生成字符数组对比*/
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
