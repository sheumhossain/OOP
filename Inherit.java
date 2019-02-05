package inherit;

public class Inherit {
	public static void main(String args[]) {
		Teacher t1 = new Teacher();
		t1.name="sheum";
		t1.age=22;
		t1.display2();
		
		//private inheritence;
		t1.setEducation("BCS");
		t1.setGender("male");
		t1.setMo_no(12345);
		System.out.println(t1.getEducation());
		System.out.println(t1.getGender());
		System.out.println(t1.getMo_no());
	}
}
