package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "last-leaf.txt";
	static final String target = rootPath + "last-leaf-filtered.txt";
	
	public static void main(String[] args) {
		// Main Stream
		Reader reader = null;
		Writer writer = null;
		
		//	보조 스트림
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			reader = new FileReader(source);
			writer = new FileWriter(target);
			
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
			
			//	편의 기능으로 한 줄 단위(개행된 문자열) 입출력할 수 있다
			String line = null;
			
			while((line = br.readLine()) != null) {
				//	읽어들인 라인 중, leaf or leaves 단어가 포함된 라인만 target으로 저장
				if (line.toLowerCase().contains("leaf")||
						line.toLowerCase().contains("leaves")) {
					System.out.println(line);
					bw.write(line);
					bw.newLine(); //	개행 출력
				}
			}
			
			System.out.println("필터링 완료!");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();	//	보조스트림을 닫으면 주 스트림도 닫힌다
				bw.close();
			} catch (Exception e) {
				
			}
		}
	}

}
