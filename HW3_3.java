
class Bus implements Runnable{
	private int seat = 10;
	public void run(){
		synchronized(this){
			Reserve((int)(Math.random()*10));
			
		}
	}


public void Reserve(int n){
	if(seat>=n){
		 System.out.println("===========================================");
         System.out.println(Thread.currentThread( ).getName( )+"�� ������. ");
         System.out.println("������ �¼� �� : " +seat+ " ��û �¼� �� : " + n);
         System.out.println(n+" �¼��� ����Ǿ����ϴ�.");
         System.out.println(Thread.currentThread().getName()+"�� �����ϴ�.");
         System.out.println("===========================================");
         seat -=n;
      }else{ 
    	  System.out.println("===========================================");
	      System.out.println(Thread.currentThread( ).getName( )+"�� ������. ");
	      System.out.println("������ �¼� �� : " +seat+ " ��û �¼� �� : " +n);
	      System.out.println("�¼� ������ �Ұ����մϴ�."); 
	      System.out.println(Thread.currentThread().getName()+"�� �����ϴ�.");
	      System.out.println("===========================================");
         
      }
	
}
}

public class ex4 {
	 public static void main(String[] args){ 
		  Bus c = new Bus( ); 
	      Thread t0 = new Thread(c,"Thread-0"); 
	      Thread t1 = new Thread(c,"Thread-1"); 
	      Thread t2 = new Thread(c,"Thread-2");
	      
	      t0.start( ); 
	      t1.start( );
	      t2.start( );
	   } 
}