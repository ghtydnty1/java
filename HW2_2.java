import java.util.*;
public class mini_test {
	public static void main(String[]args){
		int i =(int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int answer,b=0;
		do{
			System.out.println("������ �����Ͽ����ÿ�.");
			answer = sc.nextInt();
			b++; //b=b+1
		if (i<answer)
			System.out.println("���ڰ� �� �����ϴ�.");
		else if (i>answer)
			System.out.println("���ڰ� �� �����ϴ�.");
		}
		
		while(i != answer);
		System.out.println("�����մϴ�!");
		System.out.println("�õ�Ƚ��:"+b);
		}
	}