package com.thinkerofbraver.learning.tools;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * ����ҳ����ת��Ϊjson��ʽ
 * @author ��
 *2020.10.13
 */
public class ToJson {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new ToJson().readFile();
		
	}
	
	//��ȡ�ļ�,���д���,Ȼ����д�ӡ
	public void readFile() throws Exception {
		String fileName ="C:\\Users\\lenovo\\Desktop\\test01.txt";
		FileReader fileReader = new FileReader(fileName);
		
		//���ñ����ʽ���������������
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));

        String line =br.readLine();	     
        while (line!=null){         
            System.out.println(shift(line));
            line = br.readLine();
        }
        br.close();
        fileReader.close();
	}
	
	//�ı��ʽ
	public String shift(String line) {
		String[] strings=line.split(":");
		strings[0]="\""+strings[0]+"\"";
		for(int i=1;i<strings.length;i++) {
			strings[0]+=":"+strings[i];
		}
		return strings[0]+",";
	}
}



/*
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * ����ҳ����ת��Ϊjson��ʽ
 * @author ��
 *2020.10.13
 */
/*
public class ToJson {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.print("������Ҫת����txt�ļ�·����");
		//Scanner scanner=new Scanner(System.in);
		//String string=scanner.next();
		//new ToJson().readFile(string);
		new ToJson().readFile();
		
	}
	
	//��ȡ�ļ�,���д���,Ȼ����д�ӡ
		public void readFile() throws Exception {
			String fileName ="C:\\Users\\lenovo\\Desktop\\test01.txt";
			FileReader fileReader = new FileReader(fileName);
			
			//���ñ����ʽ���������������
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
			
	        //BufferedReader bufferedReader = new BufferedReader(fileReader);
	         
	        
	        String line =br.readLine();
	        
	        while (line!=null){         
	            System.out.println(shift(line));
	            line = br.readLine();
	        }

	        //bufferedReader.close();
	        br.close();
	        fileReader.close();
		}

	
	//��ȡ�ļ�,���д���,Ȼ����д�ӡ
	public void readFile(String fileName) throws Exception {
		//String fileName ="C:\\Users\\lenovo\\Desktop\\test01.txt";
		FileReader fileReader = new FileReader(fileName);
		
		//���ñ����ʽ���������������
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
		
        //BufferedReader bufferedReader = new BufferedReader(fileReader);
         
        
        String line =br.readLine();
        
        while (line!=null){         
            System.out.println(shift(line));
            line = br.readLine();
        }

        //bufferedReader.close();
        br.close();
        fileReader.close();
	}
	
	//�ı��ʽ
	public String shift(String line) {
		String[] strings=line.split(":");
		strings[0]="\""+strings[0]+"\"";
		for(int i=1;i<strings.length;i++) {
			strings[0]+=":"+strings[i];
		}
		return strings[0]+",";
	}
}
*/
