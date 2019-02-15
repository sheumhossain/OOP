package class_object;

class Employee{
	int id;
	String name;
	
	void set(int i,String n) {
		id=i;
		name=n;
	}

	void display() {
		System.out.println("name = "+ name +" ; id = "+id );
	}
	
}
public class Introduction {
	String work;
	void display_from_intr() {
		System.out.println("object calling of main method contained class = "+work);
	}
	public static void main(String args[]) {
		
		Introduction intr = new Introduction();//obj of this class;
		intr.work = "developer";
		intr.display_from_intr();
		
		System.out.println("object of  another class,but same file");
		Employee emp = new Employee();//obj of another class,but same file; 
		emp.id = 100; //in this way directly variables value can be assigned ;
		emp.name = "sheum"; //in this way directly variables value can be assigned ;
		emp.display();
		//or by set method;
		Employee emp1 = new Employee();
		emp1.set(101, "hossin");
		emp1.display();
		
		System.out.println("object of out class");
		//creating object of out class
		Other_class othr = new Other_class();
		othr.id=103;
		othr.name = "apple";
		othr.display_out();
		
	}
}
