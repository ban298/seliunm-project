package program;

abstract class mohan {
	public abstract void exe();
	public void run() {
	}
}
class ram extends mohan{
	public void exe() {
	}
	public void print() {
		System.out.println("good evenaing");
	}	
}
	
class abstraction extends mohan{
	public void exe() {	
	}
		public void num() {
			System.out.println("good night");
			
		}
	 
		public static void main(String[]args) {
			abstraction b=new abstraction();
			ram a=new ram();
			a.print();
			b.num();
		}
}



