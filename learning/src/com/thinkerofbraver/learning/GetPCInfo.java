package com.thinkerofbraver.learning;

import java.util.Properties;//导入Properties类
public class GetPCInfo{
	
	
 public static void main(String args[]) throws InterruptedException{
	 
	 while(true) {
		 
		 new GetPCInfo().getSystemInfo();
		 System.out.println();
		 Thread.sleep(10000);
	 }
	 
 }
 
 public void getSystemInfo() {
	 
	 Properties p=System.getProperties();//获取当前的系统属性
	  //p.list(System.out);//将属性列表输出
	  System.out.print("CPU个数:");//Runtime.getRuntime()获取当前运行时的实例
	  System.out.println(Runtime.getRuntime().availableProcessors());//availableProcessors()获取当前电脑CPU数量
	  System.out.print("虚拟机内存总量:");
	  System.out.println(Runtime.getRuntime().totalMemory());//totalMemory()获取java虚拟机中的内存总量
	  System.out.print("虚拟机空闲内存量:");
	  System.out.println(Runtime.getRuntime().freeMemory());//freeMemory()获取java虚拟机中的空闲内存量
	  System.out.print("虚拟机使用最大内存量:");
	  System.out.println(Runtime.getRuntime().maxMemory());//maxMemory()获取java虚拟机试图使用的最大内存量
	  
 }
 
 
 
 
}