package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			//	소켓 객체 생성
			socket = new Socket();
			
			//	시작 메시지
			System.out.println("<클라이언트 시작>");
			System.out.println("CLIENT: [연결을 요청합니다]");
			
			//	접속 시도
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			socket.connect(remote);
			
			//	접속 성공
			System.out.println("CLIENT: [서버에 연결되었습니다]");
			
			
			
			//	메시지 전송 
			OutputStream os = socket.getOutputStream();	//	소켓에서 출력 스트림 획득
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			//	Echo back 메시지 수신
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			//	메시지 송신
//			String message = "테스트 메시지";
//			bw.write(message);
//			bw.newLine();
//			bw.flush();
			
//			
//			System.out.println("CLIENT:[전송 메시지]:" + message);
//			
//			//	메시지 수신
//			String rcvMsg = br.readLine();
//			System.out.println("CLIENT:[수신 메시지]:" + rcvMsg);
			
			//	사용자로부터 메시지를 입력 -> 서버로 전송
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.print("CLIENT:>");
				String message = scanner.nextLine(); //	한 줄을 입력
				if (message.equals("/q")) {
					//	탈출
					System.out.println("CLIENT:[접속을 종료합니다]");
					break;
				}
				System.out.println("CLIENT:[메시지 전송]:" + message);
				bw.write(message);
				bw.newLine();
				bw.flush();
				
				String rcvMsg = br.readLine();
				System.out.println("CLIENT:[메시지 수신]:" + rcvMsg);
			}
			
			scanner.close();
			br.close();
			bw.close();
			
			
			
			
			
			
			
			
			//	후처리
			System.out.println("<클라이언트 종료>");
			
		} catch (ConnectException e) {
			System.err.println("[접속이 거부되었습니다]");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
