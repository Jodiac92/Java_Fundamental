package java_20190808.unicasat.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UnicasServerThread implements Runnable {
	private Socket socket = null;

	public UnicasServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));		
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
			while(true) {
				String readLine = br.readLine();
				System.out.println(readLine);
				bw.write(readLine);
				bw.newLine();
				bw.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
