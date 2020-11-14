package com.thinkerofbraver.learning.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ����һ���������� arr�������æͳ��������ÿ�����ĳ��ִ�����
���ÿ�����ĳ��ִ������Ƕ�һ�޶��ģ��ͷ��� true�����򷵻� false��
ʾ�� 1��
���룺arr = [1,2,2,1,1,3]
�����true
���ͣ��ڸ������У�1 ������ 3 �Σ�2 ������ 2 �Σ�3 ֻ������ 1 �Ρ�û���������ĳ��ִ�����ͬ��

ʾ�� 2��
���룺arr = [1,2]
�����false

ʾ�� 3��
���룺arr = [-3,0,1,-3,1,1,1,-3,10,0]
�����true
 * @author ��
 *2020.10.28
 */
public class Solution1207 {
	
	static int x;
	public static void main(String[] args) {
		int y;
		System.out.println(x);
		//System.out.println(y);
		int[] arr= {-3,0,1,-3,1,1,1,-3,10,0};
		long start=System.currentTimeMillis();
		System.out.println(new Solution1207().uniqueOccurrences(arr));
		long end=System.currentTimeMillis();
		System.out.printf("%10d",end-start);
		
	}
	
	public boolean uniqueOccurrences(int[] arr) {
	    	
	    	//��¼�Ѿ��ظ�������
			List<Integer> list=new ArrayList<Integer>();
			
			int k;
			Map<Integer, Integer> map=new HashMap<Integer, Integer>();
			for(int i=0;i<arr.length;i++) {
				
			}
			
			
			for(int i=0;i<arr.length;i++) {
				if(!list.contains(arr[i])) {
					list.add(arr[i]);
					k=0;
					k++;
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]==arr[j]) {
							k++;
						}
					}
					map.put(arr[i], k);
				}
			}
			
			//��¼�����ֳ��ֵĴ���
			List<Integer> temp=new ArrayList<Integer>();
			
			for (Integer integer : list) {
				if(temp.contains(map.get(integer))) {
					return false;
				}
				temp.add(map.get(integer));
				
			}
			return true;
	    	
	    }
}
