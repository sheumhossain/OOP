package inherit;

public class Teacher extends Student{
	private String education;
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	void display2() {
		//name,age variable is inheriting from student class;
		System.out.println("teacher name = "+name );
		System.out.println("teacher age = "+age );
		//System.out.println("teacher education = "+education );
	}
		
}
	

