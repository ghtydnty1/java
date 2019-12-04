import java.util.*;
public class mini_test {
	public static void main(String[]args){
		int i =(int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int answer,b=0;
		do{
			System.out.println("정답을 추측하여보시오.");
			answer = sc.nextInt();
			b++; //b=b+1
		if (i<answer)
			System.out.println("숫자가 더 낮습니다.");
		else if (i>answer)
			System.out.println("숫자가 더 높습니다.");
		}
		
		while(i != answer);
		System.out.println("축하합니다!");
		System.out.println("시도횟수:"+b);
		}
	}