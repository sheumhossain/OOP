package inherit;

public class Student {
	String name;
	int age; 
	void display1() {
		System.out.println("Studen name = "+name );
		System.out.println("Studen age = "+age );
	}
	//private variable inheritence;
	private String gender;
	private int mo_no;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMo_no() {
		return mo_no;
	}
	public void setMo_no(int mo_no) {
		this.mo_no = mo_no;
	}
	
}
