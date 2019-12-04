
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
         System.out.println(Thread.currentThread( ).getName( )+"가 들어왔음. ");
         System.out.println("가능한 좌석 수 : " +seat+ " 요청 좌석 수 : " + n);
         System.out.println(n+" 좌석이 예약되었습니다.");
         System.out.println(Thread.currentThread().getName()+"가 나갑니다.");
         System.out.println("===========================================");
         seat -=n;
      }else{ 
    	  System.out.println("===========================================");
	      System.out.println(Thread.currentThread( ).getName( )+"가 들어왔음. ");
	      System.out.println("가능한 좌석 수 : " +seat+ " 요청 좌석 수 : " +n);
	      System.out.println("좌석 예약이 불가능합니다."); 
	      System.out.println(Thread.currentThread().getName()+"가 나갑니다.");
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