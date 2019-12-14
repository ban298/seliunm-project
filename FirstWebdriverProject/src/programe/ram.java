package programe;

interface mohan {
public void run();
}
interface show{
	public void num();
	
}
interface showable{
	public void shlow();
}
class ram implements mohan,show,showable{
	public void run() {
		System.out.println("hello word");
	}
	public void num() {
		System.out.println("green word");
	}
	public void shlow() {
		System.out.println("red word");
	}
	public  static void main(String[]args) {
		ram a=new ram();
		a.run();
		a.num();
		a.shlow();
	}
}
for(int i=0;i<5;i++) {
	 for(int j=4;j>i;j--) {
		 System.out.print(" ");
	 }
	 for(int k=0;k<(2*i+1);k++) {
		System.out.print("*"); 
	 }
		 System.out.println();
}
// System.out.println("*"); 