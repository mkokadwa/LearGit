package practice;

public class Init {

	int var;
	String str;
	
	public void display(int i, String s)
	{
		this.var=i;
		this.str=s;
	}
	
	public void print() {
		System.out.println("My Name is :" + str);
		System.out.println("My Roll no is : "+ var);
	}
}


