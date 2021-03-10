package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "img.jpg";
	static final String target = rootPath + "img_copy.jpg";
	
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream(source);	
			os = new FileOutputStream(target);
			
			int data = 0;	//	1byte를 읽고 int으로 변환
			
			System.out.println("복사를 시작합니다...");
			while((data = is.read()) != -1) {
				os.write(data);
			}
			System.out.println("복사를 종료합니다...");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			System.err.println("복사 실패!");
		} finally {
			try {
				os.close();
				is.close();
			} catch (Exception e) {
				
			}
		}

	}

}
