package Java_20190801;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("c:\\dev\\test\\jdk.exe");
			File f1 = new File("c:\\dev\\test\\2019\\8\\1");
			boolean isExisted = f1.isDirectory();
			if (!isExisted) {
				f1.mkdirs();
			}
			//FileOutputStream(String path) 생성자에서 FileNotFoundException
			//에러의 의미는 경로가 없기 때문에 발생하는 것임.
			//따라서 FileOutputStream 객체를 생성할 때는 경로가 있는지 체크한 후에 객체를 생성해야 한다.
			fos = new FileOutputStream("c:\\dev\\test\\2019\\8\\1\\jdk.exe");
			int readByte = 0;
			while((readByte = fis.read()) != -1) {
				//fis.write(readByte)는 한 바이트 쓰기
				System.out.println(readByte); //while문 외우기*
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}finally {
			try {
				if(fis != null)	fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}