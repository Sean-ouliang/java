package day05;
//�žų˷���
public class MutiType {
	public static void main(String[] args){
		for(int i=1;i<=9;i++){//������
			for(int j=1;j<=i;j++){//������
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();//����
		}
		System.out.println();
		for(int i=9;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=9;i++){
			for(int j=9;j>=1;j--){
				if(i>=j){
					System.out.print(j+"*"+i+"="+i*j+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
