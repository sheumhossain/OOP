package encap;

public class Test {
	String name1;
	private String name2;//in this directly can't be access,so need setter&getter method 
	
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getName2() {
		return name2;
	}
}
