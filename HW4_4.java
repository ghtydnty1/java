public class ex7 {
	public static void main(String[] args)throws IOException {
		File f = new File("ex.txt");
		Scanner sc = new Scanner(System.in);
		String name1, name2, tel1, tel2, mail1, mail2;
		int num;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name1 = sc.nextLine();
		name2 = sc.nextLine();
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
		tel1 = sc.nextLine();
		tel2 = sc.nextLine();
		System.out.print("�̸����ּҸ� �Է��ϼ��� : ");
		mail1 = sc.nextLine();
		mail2 = sc.nextLine();
		
		PrintWriter output = new PrintWriter(f);
		output.print(1+" "); output.print(name1+" "); output.print(tel1+" "); output.println(mail1+" "); 
		output.print(2+" "); output.print(name2+" "); output.print(tel2+"  "); output.println(mail2+" ");
		output.close();
		
		File f2 = new File ("ex.txt");
		Scanner input = new Scanner(f2);
		while (input.hasNext()){
			int Num = input.nextInt();
			String Name = input.next();
			String tel = input.next();
			String email = input.next();
	
			System.out.println(Num+" "+Name+" "+tel+" "+email);
		}
		input.close();
		
		System.out.print("��ȣ�� �Է��ϼ��� : ");
		num = sc.nextInt();
		if(num ==1)
			System.out.print(tel1);
		if(num == 2)
			System.out.print(tel2);
		
		
        }
	}
}