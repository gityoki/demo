package textxxxx;

import java.io.File;

public class a {

	public static void main(String[] args) {
		File p=new File("asda.java");
		File o=new File("F:\\work place\\425\\src");
		File[] f=o.listFiles();
		for (File f1 : f) {
			System.out.println(f1.getName());
		}
		System.out.println();
		System.out.println(p.getAbsolutePath());
	}
//	public void as(File x,String y){
//		File[] q=
//	} 
}
