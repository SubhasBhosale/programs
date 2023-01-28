package practice;

import java.io.*;

public class FileHandle {

	public static void main(String[] args) throws IOException {
		File f= new File("D:/Files/Test.txt");
		FileReader fw= new FileReader(f);
		BufferedReader bw=new BufferedReader(fw);
		char[] arr= new char[12];
		fw.read(arr);
		String s=new String(arr);
		System.out.println(s);
		
	}

}
