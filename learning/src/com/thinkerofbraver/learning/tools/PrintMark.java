package com.thinkerofbraver.learning.tools;

/**
 * 用于打印标记
 * @author song
 *2020.9.28
 */
public class PrintMark {
	
	private String markString;
	
	public PrintMark(String mark) {
		this.markString=mark;
	}
	
	public void print(int num,String string) {
		String mark=this.markString;
		for(int i=0;i<num/2;i++) {
			System.out.print(mark);
		}
		System.out.print(string);
		for(int i=0;i<num/2-1;i++) {
			System.out.print(mark);
		}
		System.out.println(mark);
		
	}
	
	public void print(String string) {
		int num=20;
		String mark=this.markString;
		for(int i=0;i<num/2;i++) {
			System.out.print(mark);
		}
		System.out.print(string);
		for(int i=0;i<num/2-1;i++) {
			System.out.print(mark);
		}
		System.out.println(mark);
		
	}
	
	public static void main(String[] args) {
		PrintMark printMark=new PrintMark("-");
		printMark.print(10, "你好");
	}
	
	
	
}
