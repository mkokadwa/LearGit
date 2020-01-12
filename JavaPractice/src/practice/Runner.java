package practice;

public class Runner {

	/*public static void main(String[] args) {
		Init obj= new Init(), obj2=new Init();
		obj.display(219, "Mangesh");
		obj.print();
	
		
		
	}*/
	
	
	int x;
	static int y;
	public static void main(String[] args) {
		Blocks b= new Blocks();
		Blocks.jhut=9;
		b.main();
		
		Runner run= new Runner();
		Runner.y=9;
		int c=run.x;
	}
	
	
}

