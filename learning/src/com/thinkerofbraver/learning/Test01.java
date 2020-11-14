package com.thinkerofbraver.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 万万没想到之聪明的编辑
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
		
		//处理
		String[] strings=null;
		for (String string : lStrings) {
			//为了可变转为数组
			strings =string.split("");
			System.out.println("测试点1");
			System.out.println(string.length());
			System.out.println(strings.length);
			System.out.println(strings[0]);
			System.out.println(strings[1]);
			for(int i=0;i<string.length()-2;i++) {
				System.out.println("测试点4");
				System.out.println(i);
				System.out.println("i: "+strings[i]);
				System.out.println("i+1: "+strings[i+1]);
				if(strings[i].equals(strings[i+1])) {
					System.out.println("测试点2");
					//1. 三个同样的字母连在一起，一定是拼写错误，去掉一个的就好啦：比如 helllo -> hello
					if(strings[i+1].equals(strings[i+2])) {
						System.out.println("测试点3");

						i--;
					}
					
					//2. 两对一样的字母（AABB型）连在一起，一定是拼写错误，去掉第二对的一个字母就好啦：比如 helloo -> hello
					
					//3. 上面的规则优先“从左到右”匹配，即如果是AABBCC，虽然AABB和BBCC都是错误拼写，应该优先考虑修复AABB，结果为AABCC
					
				}
			}
		}
		
	
		
		return toList(strings);
		
	}
	
	//将数组重新拼装成字符串
	public String shift(List<String> lStrings) {
		String result="";
		for (String string : lStrings) {
			result=result+string;
		}
		
		//result=result.replaceAll(" ", "");
		return result;
	}
	
	//将字符串数组转化为list
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