package com.thinkerofbraver.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * ����û�뵽֮�����ı༭
 * @author lenovo
 *2020.9.19
 */
public class Test2 {
	
	
	public List<StringBuilder> fun1(List<StringBuilder> lStrings){
		
		//����
		for (StringBuilder sb : lStrings) {
			sb=new Test2().core(new Test2().core(sb));
		}
		
		return lStrings;
		
	}
	
	//��װ���Ĳ���
	public StringBuilder core(StringBuilder sb) {
		boolean state = true;
		for(int i=0;i<sb.length()-2;i++) {
			if(sb.charAt(i)==sb.charAt(i+1)) {
				//1. ����ͬ������ĸ����һ��һ����ƴд����ȥ��һ���ľͺ��������� helllo -> hello
				if(sb.charAt(i+1)==sb.charAt(i+2)) {
					sb.deleteCharAt(i+2);
					i--;
					
				}
				//2. ����һ������ĸ��AABB�ͣ�����һ��һ����ƴд����ȥ���ڶ��Ե�һ����ĸ�ͺ��������� helloo -> hello
				//3. ����Ĺ������ȡ������ҡ�ƥ�䣬�������AABBCC����ȻAABB��BBCC���Ǵ���ƴд��Ӧ�����ȿ����޸�AABB�����ΪAABCC
				else {
					sb.append(' ');
					//System.out.println(sb.length());
					if(sb.charAt(i+2)==sb.charAt(i+3)) {
						sb.deleteCharAt(i+2);
						i--;
						sb.deleteCharAt(sb.length());
						//new Test2().deleteSpace(sb);
					}
				}
				
				
				
			}
		}
		
		
		
		return new Test2().deleteSpace(sb);
	}
	
	//ȥ�ո�
	public StringBuilder deleteSpace(StringBuilder sb) {
		for(int j=0;j<sb.length();j++) {
			if(sb.charAt(j)==' ') {
				sb.deleteCharAt(j);
			}
		}
		return sb;
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
		
		//List<String> lStrings = new Test2().fun1();
		//lStrings.add("");
		//lStrings.add("abc");
		//System.out.println(lStrings);
		Scanner scanner = new Scanner(System.in);
		Integer len = scanner.nextInt();
		List<StringBuilder> lStrings = new ArrayList(len);
		List<StringBuilder> lStrings2=lStrings;
		while(len>0) {
			StringBuilder sb =new StringBuilder(scanner.next());
			lStrings.add(sb);
			len--;
		}
		
		long start = System.currentTimeMillis();
		
		
		List<StringBuilder> lBuilders = new Test2().fun1(lStrings);
		for (StringBuilder stringBuilder : lBuilders) {
			System.out.println(stringBuilder);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("����ʱ��"+(end-start)+"ms");
	}

}


/*
 * import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ����û�뵽֮�����ı༭
 * @author lenovo
 *2020.9.19
 */
/*
public class Main {
	
	public List<StringBuilder> fun1(){
		
		Scanner scanner = new Scanner(System.in);
		Integer len = scanner.nextInt();
		List<StringBuilder> lStrings = new ArrayList(len);
		List<StringBuilder> lStrings2=lStrings;
		while(len>0) {
			StringBuilder sb =new StringBuilder(scanner.next());
			lStrings.add(sb);
			len--;
		}
		
		//����
		for (StringBuilder sb : lStrings) {
			sb=new Main().core(new Main().core(sb));
		}
		
		return lStrings;
		
	}
	
	//��װ���Ĳ���
	public StringBuilder core(StringBuilder sb) {
		boolean state = true;
		for(int i=0;i<sb.length()-2;i++) {
			if(sb.charAt(i)==sb.charAt(i+1)) {
				//1. ����ͬ������ĸ����һ��һ����ƴд����ȥ��һ���ľͺ��������� helllo -> hello
				if(sb.charAt(i+1)==sb.charAt(i+2)) {
					sb.deleteCharAt(i+2);
					i--;
				}else {
					sb.append(' ');
					//System.out.println(sb.length());
					if(sb.charAt(i+2)==sb.charAt(i+3)) {
						sb.deleteCharAt(i+2);
						i--;
						sb = new Main().deleteSpace(sb);
					}
				}
				
				//2. ����һ������ĸ��AABB�ͣ�����һ��һ����ƴд����ȥ���ڶ��Ե�һ����ĸ�ͺ��������� helloo -> hello
				//sb.append(" ");
				//System.out.println(sb.length());
				//if(sb.charAt(i+3)==sb.charAt(i+4)) {
					//if(sb.charAt(i+1)==sb.charAt(i+2)) {
						//sb.deleteCharAt(i+2);
						//i--;
					//}
				
				//3. ����Ĺ������ȡ������ҡ�ƥ�䣬�������AABBCC����ȻAABB��BBCC���Ǵ���ƴд��Ӧ�����ȿ����޸�AABB�����ΪAABCC
				
				//}
			}
		}
		
		
		
		return new Main().deleteSpace(sb);
	}
	
	//ȥ�ո�
	public StringBuilder deleteSpace(StringBuilder sb) {
		for(int j=0;j<sb.length();j++) {
			if(sb.charAt(j)==' ') {
				sb.deleteCharAt(j);
			}
		}
		return sb;
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
		
		//List<String> lStrings = new Test2().fun1();
		//lStrings.add("");
		//lStrings.add("abc");
		//System.out.println(lStrings);
		List<StringBuilder> lBuilders = new Main().fun1();
		for (StringBuilder stringBuilder : lBuilders) {
			System.out.println(stringBuilder);
		}
	}

}
 */
