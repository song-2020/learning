package com.thinkerofbraver.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * ����û�뵽֮�����ı༭
 * @author lenovo
 *2020.9.19
 */
public class Test01 {
	
	public List<String> fun1(){
		
		Scanner scanner = new Scanner(System.in);
		Integer len = scanner.nextInt();
		List<String> lStrings = new ArrayList(len);
		List<String> lStrings2=lStrings;
		while(len>0) {
			String string = scanner.next();
			lStrings.add(string);
			len--;
		}
		
		//����
		String[] strings=null;
		for (String string : lStrings) {
			//Ϊ�˿ɱ�תΪ����
			strings =string.split("");
			System.out.println("���Ե�1");
			System.out.println(string.length());
			System.out.println(strings.length);
			System.out.println(strings[0]);
			System.out.println(strings[1]);
			for(int i=0;i<string.length()-2;i++) {
				System.out.println("���Ե�4");
				System.out.println(i);
				System.out.println("i: "+strings[i]);
				System.out.println("i+1: "+strings[i+1]);
				if(strings[i].equals(strings[i+1])) {
					System.out.println("���Ե�2");
					//1. ����ͬ������ĸ����һ��һ����ƴд����ȥ��һ���ľͺ��������� helllo -> hello
					if(strings[i+1].equals(strings[i+2])) {
						System.out.println("���Ե�3");

						i--;
					}
					
					//2. ����һ������ĸ��AABB�ͣ�����һ��һ����ƴд����ȥ���ڶ��Ե�һ����ĸ�ͺ��������� helloo -> hello
					
					//3. ����Ĺ������ȡ������ҡ�ƥ�䣬�������AABBCC����ȻAABB��BBCC���Ǵ���ƴд��Ӧ�����ȿ����޸�AABB�����ΪAABCC
					
				}
			}
		}
		
	
		
		return toList(strings);
		
	}
	
	//����������ƴװ���ַ���
	public String shift(List<String> lStrings) {
		String result="";
		for (String string : lStrings) {
			result=result+string;
		}
		
		//result=result.replaceAll(" ", "");
		return result;
	}
	
	//���ַ�������ת��Ϊlist
	public List<String> toList(String [] strings){
		
		List<String> lStrings = new ArrayList<String>(strings.length);
		for (String string : strings) {
			lStrings.add(string);
		}
		return lStrings;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lStrings = new Test01().fun1();
		lStrings.add("");
		//lStrings.add("abc");
		System.out.println(lStrings);
		System.out.println(new Test01().shift(lStrings));
	}

}