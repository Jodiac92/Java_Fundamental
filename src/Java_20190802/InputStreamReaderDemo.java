package Java_20190802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		/*
		FileOutputStream fos = null;
		System.out.println("입력하세요>");
		InputStream in = System.in;//
		byte[] b = new byte[100];
		int readByteCount = 0;
		*/
		System.out.println("입력하세요>");
		InputStream in = System.in;//소스(Source)가 키보드인 경우
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			fw = new FileWriter("c:\\dev\\test\\keyboard.txt",true); //true 이어쓰기
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);//true = autoFlush
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				if(readLine.equals("exit")) break;
				pw.println(readLine);
				System.out.println("입력하세요");
			}
			
			
			
			
			
			
			/*
			fos = new FileOutputStream("c:\\dev\\test\\keyboard.txt",true); //true는 이어쓰기 기능
			//in.read(b) => 키보드에서 enter를 치면 읽는다.
			while((readByteCount = in.read(b)) != -1) {
				String str = new String(b,0,readByteCount).trim();
				if(str.contentEquals("exit")) break;
				fos.write(b, 0, readByteCount);
				System.out.println("입력하세요");
			}
			*/
		
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in !=null) in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
