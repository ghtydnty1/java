import java.util.Scanner;

class HW1_1{
	public static void main(String [] args){
		String name, tel;
		int age;
		double weight;
		
		Scanner s = new Scanner(System.in);
		System.out.print("�̸�: ");
		name = s.nextLine();
		
		System.out.print("����: ");
		age = s.nextInt();
		
		System.out.print("������: ");
		weight = s.nextDouble();
		
		s.nextLine();
		System.out.print("��ȭ��ȣ: ");
		tel = s.nextLine();
		
		System.out.println("\n\n");
		System.out.printf("\"���� �̸��� '%s', \n", name);
		System.out.printf("\t���̴� %#x, \n", age);
		System.out.printf("\t\t�����Դ� %10.3f, \n", weight);
		System.out.printf("\t\t\t��ȭ��ȣ�� %s�Դϴ�.\"\n", tel);
	}
}