package com.thinkerofbraver.learning;

import java.util.Properties;//����Properties��
public class GetPCInfo{
	
	
 public static void main(String args[]) throws InterruptedException{
	 
	 while(true) {
		 
		 new GetPCInfo().getSystemInfo();
		 System.out.println();
		 Thread.sleep(10000);
	 }
	 
 }
 
 public void getSystemInfo() {
	 
	 Properties p=System.getProperties();//��ȡ��ǰ��ϵͳ����
	  //p.list(System.out);//�������б����
	  System.out.print("CPU����:");//Runtime.getRuntime()��ȡ��ǰ����ʱ��ʵ��
	  System.out.println(Runtime.getRuntime().availableProcessors());//availableProcessors()��ȡ��ǰ����CPU����
	  System.out.print("������ڴ�����:");
	  System.out.println(Runtime.getRuntime().totalMemory());//totalMemory()��ȡjava������е��ڴ�����
	  System.out.print("����������ڴ���:");
	  System.out.println(Runtime.getRuntime().freeMemory());//freeMemory()��ȡjava������еĿ����ڴ���
	  System.out.print("�����ʹ������ڴ���:");
	  System.out.println(Runtime.getRuntime().maxMemory());//maxMemory()��ȡjava�������ͼʹ�õ�����ڴ���
	  
 }
 
 
 
 
}