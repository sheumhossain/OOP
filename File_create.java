package file;

import java.io.File;

public class File_create {
	public static void main(String args[]) {
		File dir = new File("C:\\Users\\S T\\Desktop\\1st_javafile");
		dir.mkdirs();
		String loc = dir.getAbsolutePath();
		System.out.println(loc);
		System.out.println(dir.getName());
		 
	}
}
