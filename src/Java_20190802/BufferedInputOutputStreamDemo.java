package Java_20190802;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class BufferedInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			/*
			//1. FileInputStream과 FileOutputStream을 이용하여 1바이트 읽어서 1바이트출력한 예제이고 경과 시간은 15초.
			fis = new FileInputStream("c:\\dev\\test\\Java_pdf.zip");
			fos = new FileOutputStream("c:\\\\dev\\\\test\\\\Java_pdf.zip");
			
			int readByte = 0;
			long start = System.currentTimeMillis();
			while((readByte = fis.read()) != -1) {
				fos.write(readByte);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d%n", end-start);
			*/
			
			
			/*
			//2. BufferedInputStream과 BufferedOutputStream을 이용하여 1바이트 읽어서 1바이트출력한 예제이고 경과 시간은 0.018초.
			//BufferedInputStream의 read()메서드는 1바이트 읽어서 BufferedInputStream의 버퍼(byte[])공간에 저장한다.
			//BufferedOutputStream의 write()메서드는 1바이트 출력하는 것이 아니라 BufferedOutputStream의 버퍼(byte[])공간에 가득 차 있으면 출력한다.
			//만약 다 채워지지 않으면 출력하지 않음. 이런경우 flush()메서드를 이용하여 출력해야 함.
			fis = new FileInputStream("c:\\dev\\test\\Java_pdf.zip");
			fos = new FileOutputStream("c:\\dev\\test\\Java_pdf_copy.zip");
			
			bis = new BufferedInputStream(fis);//stream chaining
			bos = new BufferedOutputStream(fos);//stream chaining
			
			int readByte = 0;
			long start = System.currentTimeMillis();
			while((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
			//BufferedOutputStream의 버퍼(byte[])은 다 채워지면 자동으로 전송하지만 다 채워지지 않으면 전송하지 않는다. 따라서 다 채워지지 않더라도 버퍼를 비우기 위해서는 flush() 메서드를 사용해야 한다.
			bos.flush();//꼭 해야한다.
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d%n", end-start);
			*/
			
			
			fis = new FileInputStream("c:\\dev\\test\\son.jpg");
			fos = new FileOutputStream("c:\\dev\\test\\son-copy.jpg");
			
			int readByteCount = 0;
			byte[] readBytes = new byte[8192];
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes,0,readByteCount);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d%n", end-start);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
			if(fis !=null) fis.close();
			if(fos !=null) fos.close();
			if(bis !=null) bis.close();
			if(bos !=null) bos.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
