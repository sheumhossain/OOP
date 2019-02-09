package costruct_function;

class calc{
	int a=10;
	int b=15;
	int c=a+b;
}

public class Con_Fun {
	public static void main(String args[]) {
		calc obj = new calc();
		System.out.println(obj.c);
	}
}
