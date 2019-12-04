import java.util.Scanner;

class HW1_1{
	public static void main(String [] args){
		String name, tel;
		int age;
		double weight;
		
		Scanner s = new Scanner(System.in);
		System.out.print("이름: ");
		name = s.nextLine();
		
		System.out.print("나이: ");
		age = s.nextInt();
		
		System.out.print("몸무게: ");
		weight = s.nextDouble();
		
		s.nextLine();
		System.out.print("전화번호: ");
		tel = s.nextLine();
		
		System.out.println("\n\n");
		System.out.printf("\"나의 이름은 '%s', \n", name);
		System.out.printf("\t나이는 %#x, \n", age);
		System.out.printf("\t\t몸무게는 %10.3f, \n", weight);
		System.out.printf("\t\t\t전화번호는 %s입니다.\"\n", tel);
	}
}